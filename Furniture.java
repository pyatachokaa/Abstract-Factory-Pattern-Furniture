import java.util.Scanner;

class Furniture {
    private String name;
    private String style;
    private String material;
    private float price;

    public Furniture() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
    public abstract Sofa createSofa();
}

class ModernWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair("Wood", 100);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Wood", 200);
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Wood", 300);
    }
}

class ModernMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair("Metal", 120);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Metal", 220);
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Metal", 320);
    }
}

class ModernGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair("Glass", 140);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Glass", 240);
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Glass", 340);
    }
}

class TraditionalWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new TraditionalChair("Wood", 90);
    }

    @Override
    public Table createTable() {
        return new TraditionalTable("Wood", 190);
    }

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa("Wood", 290);
    }
}

class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new TraditionalChair("Metal", 110);
    }

    @Override
    public Table createTable() {
        return new TraditionalTable("Metal", 210);
    }

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa("Metal", 310);
    }
}

class TraditionalGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new TraditionalChair("Glass", 130);
    }

    @Override
    public Table createTable() {
        return new TraditionalTable("Glass", 230);
    }

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa("Glass", 330);
    }
}

class IndustrialWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new IndustrialChair("Wood", 95);
    }

    @Override
    public Table createTable() {
        return new IndustrialTable("Wood", 195);
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa("Wood", 295);
    }
}

class IndustrialMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new IndustrialChair("Metal", 115);
    }

    @Override
    public Table createTable() {
        return new IndustrialTable("Metal", 215);
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa("Metal", 315);
    }
}

class IndustrialGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new IndustrialChair("Glass", 135);
    }

    @Override
    public Table createTable() {
        return new IndustrialTable("Glass", 235);
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa("Glass", 335);
    }
}

abstract class Chair {
    protected String material;
    protected float price;
}

class ModernChair extends Chair {
    public ModernChair(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class TraditionalChair extends Chair {
    public TraditionalChair(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class IndustrialChair extends Chair {
    public IndustrialChair(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

abstract class Table {
    protected String material;
    protected float price;
}

class ModernTable extends Table {
    public ModernTable(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class TraditionalTable extends Table {
    public TraditionalTable(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class IndustrialTable extends Table {
    public IndustrialTable(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

abstract class Sofa {
    protected String material;
    protected float price;
}

class ModernSofa extends Sofa {
    public ModernSofa(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class TraditionalSofa extends Sofa {
    public TraditionalSofa(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class IndustrialSofa extends Sofa {
    public IndustrialSofa(String material, float price) {
        this.material = material;
        this.price = price;
    }
}

class FurnitureCreator {
    private FurnitureFactory factory;

    public void setFactory(FurnitureFactory factory) {
        this.factory = factory;
    }

    public Chair createChair() {
        return factory.createChair();
    }

    public Table createTable() {
        return factory.createTable();
    }

    public Sofa createSofa() {
        return factory.createSofa();
    }
}

class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureCreator creator = new FurnitureCreator();

        System.out.println("Select a style (1. Modern, 2. Traditional, 3. Industrial):");
        int styleChoice = scanner.nextInt();

        System.out.println("Select a material (1. Wood, 2. Metal, 3. Glass):");
        int materialChoice = scanner.nextInt();

        FurnitureFactory factory = null;

        if (styleChoice == 1 && materialChoice == 1) {
            factory = new ModernWoodFactory();
        } else if (styleChoice == 1 && materialChoice == 2) {
            factory = new ModernMetalFactory();
        } else if (styleChoice == 1 && materialChoice == 3) {
            factory = new ModernGlassFactory();
        } else if (styleChoice == 2 && materialChoice == 1) {
            factory = new TraditionalWoodFactory();
        } else if (styleChoice == 2 && materialChoice == 2) {
            factory = new TraditionalMetalFactory();
        } else if (styleChoice == 2 && materialChoice == 3) {
            factory = new TraditionalGlassFactory();
        } else if (styleChoice == 3 && materialChoice == 1) {
            factory = new IndustrialWoodFactory();
        } else if (styleChoice == 3 && materialChoice == 2) {
            factory = new IndustrialMetalFactory();
        } else if (styleChoice == 3 && materialChoice == 3) {
            factory = new IndustrialGlassFactory();
        }

        if (factory != null) {
            creator.setFactory(factory);
            Chair chair = creator.createChair();
            Table table = creator.createTable();
            Sofa sofa = creator.createSofa();

            System.out.println("Available products:");
            System.out.println("Chair: " + chair.getClass().getSimpleName() + ", Price: " + chair.price);
            System.out.println("Table: " + table.getClass().getSimpleName() + ", Price: " + table.price);
            System.out.println("Sofa: " + sofa.getClass().getSimpleName() + ", Price: " + sofa.price);
        } else {
            System.out.println("Invalid style or material selection.");
        }

        scanner.close();
    }
}
