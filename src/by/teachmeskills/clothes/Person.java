package by.teachmeskills.clothes;

import by.teachmeskills.clothes.footwear.IFootwear;
import by.teachmeskills.clothes.jacket.IJacket;
import by.teachmeskills.clothes.pants.IPants;

public class Person implements IPerson {

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IFootwear footwear;

    public Person(String name, IJacket jacket, IPants pants, IFootwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.footwear = footwear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IFootwear getFootwear() {
        return footwear;
    }

    public void setFootwear(IFootwear footwear) {
        this.footwear = footwear;
    }

    @Override
    public void getDressed() {
        System.out.print(name);
        jacket.putOn();
        pants.putOn();
        footwear.putOn();
    }

    @Override
    public void undress() {
        System.out.print(name);
        jacket.takeOff();
        pants.takeOff();
        footwear.takeOff();
    }
}
