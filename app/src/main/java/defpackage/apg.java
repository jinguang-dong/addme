package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apg {
    public int a;
    public final Object b;
    public Object c;

    public apg() {
        this.b = new bdp(new ant[16]);
    }

    public final ant a(int i) {
        if (i < 0 || i >= this.a) {
            akg.d("Index " + i + ", size " + this.a);
        }
        Object obj = this.c;
        if (obj != null) {
            ant antVar = (ant) obj;
            int i2 = antVar.a;
            if (i < antVar.b + i2 && i2 <= i) {
                return antVar;
            }
        }
        bdp bdpVar = (bdp) this.b;
        ant antVar2 = (ant) bdpVar.a[byi.au(bdpVar, i)];
        this.c = antVar2;
        return antVar2;
    }

    public final void b(int i, Object obj) {
        if (i < 0) {
            akg.b("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        ant antVar = new ant(this.a, i, obj);
        this.a += i;
        ((bdp) this.b).n(antVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uhf] */
    public final Object c(aim aimVar, float f, uhb uhbVar) {
        this.a = 0;
        return ung.s(this.b, new agp(f, this, aimVar, null), uhbVar);
    }

    public /* synthetic */ apg(ocq ocqVar) {
        bim bimVar = aiu.c;
        this.c = ocqVar;
        this.b = bimVar;
    }
}
