package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class shq {
    public static final shq c = new shm();
    public static final shq d = new shm();

    protected shq() {
    }

    static shq b(shq shqVar, shq shqVar2) {
        shq shqVar3;
        shq shqVar4;
        if (shqVar != null) {
            if (shqVar2 == null || shqVar == (shqVar3 = c) || shqVar2 == (shqVar4 = d)) {
                return shqVar;
            }
            if (shqVar2 != shqVar3 && shqVar != shqVar4) {
                return new shn(shqVar, shqVar2);
            }
        }
        return shqVar2;
    }

    protected abstract void a();
}
