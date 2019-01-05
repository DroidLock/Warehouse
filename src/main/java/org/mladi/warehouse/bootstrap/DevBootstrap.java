package org.mladi.warehouse.bootstrap;

import org.mladi.warehouse.Model.Artikel;
import org.mladi.warehouse.Model.Lieferant;
import org.mladi.warehouse.repository.IArtikelRepository;
import org.mladi.warehouse.repository.ILieferantenRepository;
import org.mladi.warehouse.repository.IPosition;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private IArtikelRepository iArtikelRepository;
    private ILieferantenRepository iLieferantenRepository;
    private IPosition iPosition;

    public DevBootstrap(IArtikelRepository iArtikelRepository, ILieferantenRepository iLieferantenRepository, IPosition iPosition) {
        this.iArtikelRepository = iArtikelRepository;
        this.iLieferantenRepository = iLieferantenRepository;
        this.iPosition = iPosition;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Lieferant amazon = new Lieferant("Amazon");
        Lieferant aliexpress = new Lieferant("AliExpress");
        iLieferantenRepository.save(amazon);
        iLieferantenRepository.save(aliexpress);

        Artikel hdd = new Artikel("Samsung 980pro", "500gb", 349.90, amazon);
        Artikel xioami = new Artikel("Xioami Pro Laptop", "1 Stück", 1249.90, aliexpress);
        Artikel usbStick = new Artikel("SanDisk Ultrafit", "64gb", 14.50, amazon);
        iArtikelRepository.save(hdd);
        iArtikelRepository.save(xioami);
        iArtikelRepository.save(usbStick);
    }
}
