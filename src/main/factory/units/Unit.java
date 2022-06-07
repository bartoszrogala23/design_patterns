package factory.units;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static lombok.AccessLevel.PROTECTED;

@AllArgsConstructor(access = PROTECTED)
@Getter
public abstract class Unit {

    private int hp;
    private int exp;
    private int dmgDone;
}
