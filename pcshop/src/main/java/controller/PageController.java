package com.example.pcshop.controller;

import com.example.pcshop.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    private List<Product> products = new ArrayList<>();

    public PageController() {
        // Товар 1
        products.add(new Product(
                1L, "All-round Performer",
                "Intel Core i5-13600KF, RTX 4070 Super, 32GB DDR5",
                "Идеальный универсал для 1440p-гейминга и работы. Процессор имеет 14 ядер и отлично справляется с многозадачностью. Кулер Deepcool AK620 держит температуры даже под нагрузкой. Материнская плата оснащена Wi-Fi 6E и качественным VRM. Видеокарта RTX 4070 Super с DLSS 3 выдаёт 120+ FPS в Cyberpunk 2077 с RT Ultra. SSD на 2 ТБ обеспечивает быструю загрузку игр. Блок питания полностью модульный. Сборка сбалансирована, тихая и тянет всё на максималках.",
                "145 000 ₽", "/images/pc1.jpg",
                new String[]{
                        "Процессор: Intel Core i5-13600KF",
                        "Кулер: Deepcool AK620",
                        "Материнская плата: MSI MAG B760 TOMAHAWK WIFI",
                        "ОЗУ: 32 ГБ Kingston FURY Beast DDR5 5600 МГц",
                        "Видеокарта: NVIDIA RTX 4070 Super 12 ГБ (ASUS Dual)",
                        "Накопитель: SSD 2 ТБ WD Black SN770",
                        "БП: 750 Вт Corsair RM750e",
                        "Корпус: Lian Li LANCOOL 216"
                }, true));

        // Товар 2
        products.add(new Product(
                2L, "AMD Value King",
                "Ryzen 5 7600X, RX 7900 GRE, 32GB DDR5",
                "Лучшее соотношение цена/производительность на AM5. Процессор разгоняется до 5.3 ГГц, а кулер Peerless Assassin охлаждает его лучше многих более дорогих конкурентов. Видеокарта RX 7900 GRE с 16 ГБ памяти обходит RTX 4070 в играх без трассировки лучей, выдавая 140+ FPS в Call of Duty и 120+ в Hogwarts Legacy. Оперативная память с EXPO-профилем работает на оптимальной частоте 6000 МГц. Корпус Fractal Pop Air имеет отличную вентиляцию. Отличный выбор для тех, кто хочет максимум FPS за минимальные деньги.",
                "140 000 ₽", "/images/pc2.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 5 7600X",
                        "Кулер: Thermalright Peerless Assassin 120 SE",
                        "Материнская плата: Gigabyte B650 GAMING X AX",
                        "ОЗУ: 32 ГБ G.Skill Flare X5 DDR5 6000 МГц CL30",
                        "Видеокарта: Radeon RX 7900 GRE 16 ГБ (Sapphire Pulse)",
                        "Накопитель: SSD 2 ТБ Kingston KC3000",
                        "БП: 750 Вт Be Quiet! Pure Power 12 M",
                        "Корпус: Fractal Design Pop Air"
                }, true));

        // Товар 3
        products.add(new Product(
                3L, "X3D Rocket",
                "Ryzen 7 7800X3D, RX 7900 XT, 32GB DDR5",
                "Король шутеров и киберспорта. Процессор с 3D V-Cache даёт невероятные 400+ FPS в CS2 и Valorant. Водяное охлаждение Deepcool LT520 выглядит стильно и эффективно отводит тепло. Материнская плата на чипсете B650E поддерживает PCIe 5.0 для видеокарт и SSD. Видеокарта RX 7900 XT с 20 ГБ памяти легко тянет 4K-гейминг. Блок питания на 850 Вт с запасом. Корпус NZXT H5 Flow имеет продуманную аэродинамику. Сборка для хардкорных геймеров, которым важен каждый кадр.",
                "185 000 ₽", "/images/pc3.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 7 7800X3D",
                        "Кулер: Deepcool LT520 (240 мм водянка)",
                        "Материнская плата: ASRock B650E Steel Legend WiFi",
                        "ОЗУ: 32 ГБ TeamGroup T-Force Delta DDR5 6000 МГц CL30",
                        "Видеокарта: Radeon RX 7900 XT 20 ГБ (PowerColor Hellhound)",
                        "Накопитель: SSD 2 ТБ Samsung 980 Pro",
                        "БП: 850 Вт MSI MPG A850GF",
                        "Корпус: NZXT H5 Flow"
                }, true));

        // Товар 4
        products.add(new Product(
                4L, "RTX Powerhouse",
                "Intel Core i7-13700KF, RTX 4070 Ti Super, 32GB DDR5",
                "Максимум трассировки лучей и производительности в 4K. Процессор i7-13700KF с 16 ядрами справляется с любыми задачами. 360-мм водянка Arctic — одна из лучших на рынке по эффективности. Видеокарта RTX 4070 Ti Super с 16 ГБ выдаёт 100+ FPS в Alan Wake 2 с полным RT. Материнская плата на Z790 позволяет разгонять процессор. Накопитель Kingston Fury Renegade — один из самых быстрых PCIe 4.0 SSD. Корпус Lian Li O11 Dynamic Evo — легенда для красивых сборок. Для тех, кто хочет лучшее без переплаты за 4090.",
                "215 000 ₽", "/images/pc4.jpg",
                new String[]{
                        "Процессор: Intel Core i7-13700KF",
                        "Кулер: Arctic Liquid Freezer III 360",
                        "Материнская плата: ASUS TUF GAMING Z790-PLUS WIFI",
                        "ОЗУ: 32 ГБ Corsair Vengeance DDR5 6000 МГц CL36",
                        "Видеокарта: NVIDIA RTX 4070 Ti Super 16 ГБ (MSI Gaming X Slim)",
                        "Накопитель: SSD 2 ТБ Kingston Fury Renegade",
                        "БП: 850 Вт Thermaltake Toughpower GF3",
                        "Корпус: Lian Li O11 Dynamic Evo"
                }, true));

        // Товар 5
        products.add(new Product(
                5L, "Future Proof",
                "Ryzen 9 7900, RX 7900 GRE, 32GB DDR5",
                "Сборка с упором на долговечность и апгрейд. Ryzen 9 7900 имеет 12 ядер и TDP всего 65 Вт — его легко охлаждать даже воздушным кулером. Материнская плата на B650 позволит в будущем поставить любой процессор AM5 вплоть до Ryzen 9 8950X. Видеокарта RX 7900 GRE с 16 ГБ памяти останется актуальной годы. Накопитель WD Black SN850X — топовый PCIe 4.0 SSD с кешем DRAM. Блок питания на 850 Вт с запасом под будущую видеокарту. Корпус Corsair 4000D Airflow — один из лучших по вентиляции. Идеально для тех, кто собирает ПК на 5+ лет.",
                "165 000 ₽", "/images/pc5.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 9 7900",
                        "Кулер: Thermalright Phantom Spirit 120",
                        "Материнская плата: ASUS TUF GAMING B650-PLUS WIFI",
                        "ОЗУ: 32 ГБ Kingston FURY Beast DDR5 5600 МГц",
                        "Видеокарта: Radeon RX 7900 GRE 16 ГБ (PowerColor Fighter)",
                        "Накопитель: SSD 2 ТБ WD Black SN850X",
                        "БП: 850 Вт Deepcool PQ850M",
                        "Корпус: Corsair 4000D Airflow"
                }, true));

        // Товар 6
        products.add(new Product(
                6L, "Budget Destroyer",
                "Intel Core i5-13400F, RX 7700 XT, 32GB DDR4",
                "Самый бюджетный компьютер в подборке, но всё ещё выдающий 100+ FPS. Процессор i5-13400F имеет 10 ядер и недорогой. Видеокарта RX 7700 XT тянет все игры в 1080p на ультра и 1440p на высоких настройках. Оперативная память DDR4 3600 МГц позволяет сэкономить без потери производительности. Накопитель Samsung 980 Pro — быстрый PCIe 4.0 SSD. Корпус Zalman S2 недорогой, но с хорошей вентиляцией. Отличный старт для 1080p-гейминга.",
                "105 000 ₽", "/images/pc6.jpg",
                new String[]{
                        "Процессор: Intel Core i5-13400F",
                        "Кулер: ID-COOLING SE-214-XT",
                        "Материнская плата: MSI PRO B760M-P DDR4",
                        "ОЗУ: 32 ГБ Kingston FURY Renegade DDR4 3600 МГц",
                        "Видеокарта: Radeon RX 7700 XT 12 ГБ (Sapphire Pulse)",
                        "Накопитель: SSD 1 ТБ Samsung 980 Pro",
                        "БП: 650 Вт Cooler Master MWE Bronze V2",
                        "Корпус: Zalman S2"
                }, true));

        // Товар 7
        products.add(new Product(
                7L, "White Aesthetic",
                "Ryzen 5 7500F, RX 7800 XT, 32GB DDR5",
                "Красивая белая сборка без переплаты за бренд. Процессор Ryzen 5 7500F — аналог 7600 без встроенной графики, дешевле и такой же быстрый. Видеокарта Sapphire Pure White — редкая белая модель с отличным охлаждением. Все компоненты подобраны в единой цветовой гамме. Производительности хватает для 1440p в любых играх. Корпус Montech AIR 100 White компактный и хорошо продуваемый. Для тех, кто ценит эстетику.",
                "130 000 ₽", "/images/pc7.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 5 7500F",
                        "Кулер: ID-COOLING SE-224-XTS White",
                        "Материнская плата: ASRock B650M Pro RS WiFi White",
                        "ОЗУ: 32 ГБ Kingston FURY Beast White DDR5 5600 МГц",
                        "Видеокарта: Radeon RX 7800 XT 16 ГБ (Sapphire Pure White)",
                        "Накопитель: SSD 1 ТБ WD SN580",
                        "БП: 750 Вт Deepcool PM750D White",
                        "Корпус: Montech AIR 100 White"
                }, true));

        // Товар 8
        products.add(new Product(
                8L, "Small Form Factor",
                "Intel Core i5-13500, RTX 4060 Ti 16GB, 32GB DDR5",
                "Компактный компьютер для тех, у кого мало места на столе. Процессор i5-13500 с 14 ядрами и встроенной графикой на случай проблем с видеокартой. Кулер Noctua NH-D12L специально создан для невысоких корпусов. Видеокарта RTX 4060 Ti 16 ГБ — одна из немногих компактных моделей с большим объёмом памяти. Блок питания Corsair SF750 — лучший SFX на рынке. Корпус Jonsbo D31 Mesh поддерживает ATX-блоки, но сам очень компактный. Идеально для гостиной или офиса.",
                "135 000 ₽", "/images/pc8.jpg",
                new String[]{
                        "Процессор: Intel Core i5-13500",
                        "Кулер: Noctua NH-D12L",
                        "Материнская плата: ASUS TUF GAMING B760M-PLUS WIFI",
                        "ОЗУ: 32 ГБ Corsair Vengeance DDR5 5600 МГц",
                        "Видеокарта: NVIDIA RTX 4060 Ti 16 ГБ (MSI Ventus 2X)",
                        "Накопитель: SSD 1 ТБ Samsung 980 Pro",
                        "БП: 650 Вт Corsair SF750 (SFX)",
                        "Корпус: Jonsbo D31 Mesh"
                }, true));

        // Товар 9
        products.add(new Product(
                9L, "No RGB Pure Performance",
                "Intel Core i7-12700KF, RX 7900 GRE, 32GB DDR4",
                "Никакой подсветки — только производительность. Процессор i7-12700KF до сих пор очень актуален и дёшев на вторичке. Материнская плата на Z690 позволяет разгонять память и процессор. Оперативная память DDR4 3600 МГц с низкими таймингами почти не уступает DDR5 в играх. Видеокарта PowerColor Fighter без подсветки, но с отличным кулером. Корпус Fractal Meshify 2 Compact славится акустикой и вентиляцией. Для минималистов.",
                "150 000 ₽", "/images/pc9.jpg",
                new String[]{
                        "Процессор: Intel Core i7-12700KF",
                        "Кулер: Arctic Freezer 34 eSports DUO",
                        "Материнская плата: Gigabyte Z690 GAMING X",
                        "ОЗУ: 32 ГБ Kingston FURY Beast DDR4 3600 МГц",
                        "Видеокарта: Radeon RX 7900 GRE 16 ГБ (PowerColor Fighter)",
                        "Накопитель: SSD 2 ТБ Kingston KC3000",
                        "БП: 750 Вт Be Quiet! Straight Power 11",
                        "Корпус: Fractal Design Meshify 2 Compact"
                }, true));

        // Товар 10
        products.add(new Product(
                10L, "NVIDIA Focus",
                "Ryzen 5 7600, RTX 4070, 32GB DDR5",
                "Сборка с фокусом на технологии NVIDIA. RTX 4070 поддерживает DLSS 3 и отличную трассировку лучей. Процессор Ryzen 5 7600 (без X) потребляет меньше энергии и легче охлаждается. Кулер Deepcool AG400 простой, но надёжный. Материнская плата имеет Wi-Fi и Bluetooth. Блок питания с золотым сертификатом. Корпус Cougar MX330-G — классическая башня с хорошей вентиляцией. Хороший выбор для тех, кому важны DLSS и RT.",
                "125 000 ₽", "/images/pc10.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 5 7600",
                        "Кулер: Deepcool AG400",
                        "Материнская плата: MSI PRO B650M-A WIFI",
                        "ОЗУ: 32 ГБ G.Skill Ripjaws S5 DDR5 5600 МГц",
                        "Видеокарта: NVIDIA RTX 4070 12 ГБ (Palit Dual)",
                        "Накопитель: SSD 1 ТБ WD SN580",
                        "БП: 650 Вт Cooler Master MWE Gold",
                        "Корпус: Cougar MX330-G"
                }, true));

        // Товар 11
        products.add(new Product(
                11L, "Streaming & Recording",
                "Intel Core i7-13700, RTX 4070 Super, 32GB DDR5",
                "Оптимальный компьютер для стримеров и видеоблогеров. Процессор i7-13700 (без K) имеет 16 ядер и встроенную графику Intel Quick Sync для ускорения кодирования. Видеокарта NVIDIA NVENC отлично справляется с записью и трансляцией без потери FPS. Накопитель Samsung 980 Pro на 2 ТБ позволит хранить много записей. Корпус be quiet! Pure Base 500DX имеет тихие вентиляторы. Материнская плата с Wi-Fi 6E и хорошим звуком. Для тех, кто играет и стримит одновременно.",
                "170 000 ₽", "/images/pc11.jpg",
                new String[]{
                        "Процессор: Intel Core i7-13700",
                        "Кулер: Deepcool AK620",
                        "Материнская плата: MSI MAG B760 TOMAHAWK WIFI",
                        "ОЗУ: 32 ГБ Kingston FURY Beast DDR5 5600 МГц",
                        "Видеокарта: NVIDIA RTX 4070 Super 12 ГБ (Gigabyte Gaming OC)",
                        "Накопитель: SSD 2 ТБ Samsung 980 Pro",
                        "БП: 750 Вт Corsair RM750e",
                        "Корпус: be quiet! Pure Base 500DX"
                }, true));

        // Товар 12
        products.add(new Product(
                12L, "Compact Power ITX",
                "Ryzen 7 7800X3D, RTX 4070 Super, 32GB DDR5",
                "Мощнейший компьютер в сверхкомпактном корпусе. Процессор 7800X3D даёт лучший игровой FPS, но при этом его можно охлаждать низкопрофильным кулером Noctua. Корпус Fractal Design Terra — шедевр дизайна, поддерживает видеокарты до 322 мм. Видеокарта Zotac Twin Edge как раз подходит по размеру. Блок питания Corsair SF750 — эталон надёжности для ITX. Материнская плата B650E поддерживает PCIe 5.0. Сборка для энтузиастов, которым нужна мощность в минимальном объёме.",
                "200 000 ₽", "/images/pc12.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 7 7800X3D",
                        "Кулер: Noctua NH-L9x65",
                        "Материнская плата: ASRock B650E PG-ITX WIFI",
                        "ОЗУ: 32 ГБ G.Skill Flare X5 DDR5 6000 МГц",
                        "Видеокарта: NVIDIA RTX 4070 Super 12 ГБ (Zotac Twin Edge)",
                        "Накопитель: SSD 2 ТБ Kingston KC3000",
                        "БП: 750 Вт Corsair SF750",
                        "Корпус: Fractal Design Terra"
                }, true));

        // Товар 13
        products.add(new Product(
                13L, "High Refresh eSports",
                "Intel Core i5-14600KF, RX 7700 XT, 32GB DDR5",
                "Специализированная сборка для киберспорта и соревновательных шутеров. Процессор i5-14600KF имеет высокую частоту до 5.3 ГГц, что критично для CS2 и Valorant. Водяное охлаждение Arctic 280 мм держит температуры даже при разгоне. Видеокарта RX 7700 XT — избыточна для 1080p в шутерах, но позволит играть и в AAA-проекты. Материнская плата на Z790 позволяет разгонять память до высоких частот. Корпус Phanteks G360A имеет отличную продуваемость. Для тех, кому нужны 360+ FPS в соревновательных играх.",
                "140 000 ₽", "/images/pc13.jpg",
                new String[]{
                        "Процессор: Intel Core i5-14600KF",
                        "Кулер: Arctic Liquid Freezer II 280",
                        "Материнская плата: ASUS PRIME Z790-P",
                        "ОЗУ: 32 ГБ Kingston FURY Beast DDR5 6000 МГц",
                        "Видеокарта: Radeon RX 7700 XT 12 ГБ (ASUS Dual)",
                        "Накопитель: SSD 1 ТБ WD SN580",
                        "БП: 750 Вт Thermaltake Toughpower GF1",
                        "Корпус: Phanteks Eclipse G360A"
                }, true));

        // Товар 14
        products.add(new Product(
                14L, "Quiet Workstation",
                "Ryzen 9 7900X, RTX 4070 Ti Super, 64GB DDR5",
                "Тихий компьютер для работы и игр. Процессор Ryzen 9 7900X с 12 ядрами отлично подходит для рендеринга и компиляции. Кулер Noctua NH-D15 — легендарная тишина и эффективность. Корпус be quiet! Silent Base 802 имеет шумопоглощающие панели. Видеокарта RTX 4070 Ti Super с 16 ГБ памяти тянет и игры, и нейросети. Оперативной памяти 64 ГБ — с запасом под виртуальные машины и монтаж видео. Блок питания Seasonic с 12-летней гарантией. Для тех, кто не хочет слышать свой ПК.",
                "230 000 ₽", "/images/pc14.jpg",
                new String[]{
                        "Процессор: AMD Ryzen 9 7900X",
                        "Кулер: Noctua NH-D15",
                        "Материнская плата: Gigabyte B650 AORUS ELITE AX",
                        "ОЗУ: 64 ГБ Kingston FURY Beast DDR5 5600 МГц",
                        "Видеокарта: NVIDIA RTX 4070 Ti Super 16 ГБ (MSI Ventus 3X)",
                        "Накопитель: SSD 2 ТБ WD Black SN850X",
                        "БП: 850 Вт Seasonic Focus GX-850",
                        "Корпус: be quiet! Silent Base 802"
                }, true));

        // Товар 15
        products.add(new Product(
                15L, "Best Value DDR4",
                "Intel Core i5-12600KF, RX 7800 XT, 32GB DDR4",
                "Максимальная производительность за минимальные деньги с использованием DDR4. Процессор i5-12600KF до сих пор бьётся с современными i5 в играх. Материнская плата на B660 с DDR4 позволяет сэкономить бюджет. Оперативная память Kingston Renegade 3600 МГц с низкими таймингами почти не уступает DDR5. Видеокарта Sapphire Nitro+ RX 7800 XT — одна из лучших по охлаждению. Накопитель KC3000 — быстрый PCIe 4.0 SSD. Корпус Corsair 275R Airflow с хорошей вентиляцией. Лучший выбор для сборки до 120 тысяч рублей.",
                "120 000 ₽", "/images/pc15.jpg",
                new String[]{
                        "Процессор: Intel Core i5-12600KF",
                        "Кулер: ID-COOLING SE-224-XTS",
                        "Материнская плата: ASUS TUF GAMING B660-PLUS WIFI DDR4",
                        "ОЗУ: 32 ГБ Kingston FURY Renegade DDR4 3600 МГц",
                        "Видеокарта: Radeon RX 7800 XT 16 ГБ (Sapphire Nitro+)",
                        "Накопитель: SSD 1 ТБ Kingston KC3000",
                        "БП: 700 Вт Be Quiet! System Power 10",
                        "Корпус: Corsair 275R Airflow"
                }, true));
    }

    @GetMapping("/")
    public String home(Model model) {
        // ТОП-5 товаров для главной страницы
        model.addAttribute("featuredProducts", products.subList(0, 5));
        model.addAttribute("pageTitle", "PrimePc - игровые компьютеры");
        return "index";
    }

    @GetMapping("/catalog")
    public String catalog(Model model) {
        model.addAttribute("products", products);
        model.addAttribute("pageTitle", "Каталог — PrimePc");
        return "catalog";
    }

    @GetMapping("/product/{id}")
    public String productPage(@PathVariable Long id, Model model) {
        Product product = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (product == null) {
            return "redirect:/catalog";
        }

        model.addAttribute("product", product);
        model.addAttribute("pageTitle", product.getName() + " — PrimePc");

        // Возвращаем соответствующий шаблон
        return "product" + id;
    }

    @GetMapping("/faq")
    public String faq(Model model) {
        model.addAttribute("pageTitle", "FAQ — PrimePc");
        return "faq";
    }

    // Метод для получения списка товаров (нужен для корзины)
    public List<Product> getProducts() {
        return products;
    }
}