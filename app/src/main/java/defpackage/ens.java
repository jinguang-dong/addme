package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ens {
    private static final eny a = new eny("CamSet");
    protected final Map d;
    protected final List e;
    protected final List f;
    protected boolean g;
    protected int h;
    protected int i;
    protected int j;
    protected enx k;
    public int l;
    protected enx m;
    protected byte n;
    protected int o;
    protected float p;
    public int q;
    public enh r;
    public eni s;
    public enj t;
    protected enk u;
    protected boolean v;
    protected boolean w;
    protected boolean x;
    protected boolean y;
    public enx z;

    protected ens() {
        this.d = new TreeMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public abstract ens a();

    public void d() {
        this.p = 1.0f;
    }

    public final enx e() {
        return new enx(this.m);
    }

    public final enx f() {
        return new enx(this.k);
    }

    public final List g() {
        return new ArrayList(this.f);
    }

    public final List h() {
        return new ArrayList(this.e);
    }

    public final void i(int i) {
        if (i <= 0 || i > 100) {
            enz.c(a, "Ignoring JPEG quality that falls outside the expected range");
        } else {
            this.n = (byte) i;
        }
    }

    public final void j(int i, int i2) {
        this.i = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        this.h = i;
        this.j = -1;
    }

    public final void k(enx enxVar) {
        if (this.g) {
            enz.c(a, "Attempt to change photo size while locked");
        } else {
            this.m = new enx(enxVar);
        }
    }

    public final void l(enx enxVar) {
        if (this.g) {
            enz.c(a, "Attempt to change preview size while locked");
        } else {
            this.k = new enx(enxVar);
        }
    }

    protected ens(ens ensVar) {
        TreeMap treeMap = new TreeMap();
        this.d = treeMap;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        treeMap.putAll(ensVar.d);
        arrayList.addAll(ensVar.e);
        arrayList2.addAll(ensVar.f);
        this.g = ensVar.g;
        this.h = ensVar.h;
        this.i = ensVar.i;
        this.j = ensVar.j;
        enx enxVar = ensVar.k;
        this.k = enxVar == null ? null : new enx(enxVar);
        this.l = ensVar.l;
        enx enxVar2 = ensVar.m;
        this.m = enxVar2 != null ? new enx(enxVar2) : null;
        this.n = ensVar.n;
        this.o = ensVar.o;
        this.p = ensVar.p;
        this.q = ensVar.q;
        this.r = ensVar.r;
        this.s = ensVar.s;
        this.t = ensVar.t;
        this.u = ensVar.u;
        this.v = ensVar.v;
        this.w = ensVar.w;
        this.x = ensVar.x;
        this.y = ensVar.y;
        this.z = ensVar.z;
    }
}
