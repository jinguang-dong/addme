package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class enl {
    public static final eny a = new eny("CamCapabs");
    public final ArrayList b;
    public final ArrayList c;
    protected final TreeSet d;
    protected final ArrayList e;
    public final ArrayList f;
    protected final TreeSet g;
    public final EnumSet h;
    protected final EnumSet i;
    protected final EnumSet j;
    protected final EnumSet k;
    protected final EnumSet l;
    protected enx m;
    protected int n;
    protected int o;
    protected float p;
    protected int q;
    protected int r;
    protected int s;
    protected float t;
    public float u;
    protected float v;
    public final AmbientMode.AmbientCallback w;

    public enl(AmbientMode.AmbientCallback ambientCallback) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new TreeSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new TreeSet();
        this.h = EnumSet.noneOf(enj.class);
        this.i = EnumSet.noneOf(enh.class);
        this.j = EnumSet.noneOf(eni.class);
        this.k = EnumSet.noneOf(enk.class);
        this.l = EnumSet.noneOf(eng.class);
        this.w = ambientCallback;
    }

    public final boolean d(eng engVar) {
        return engVar != null && this.l.contains(engVar);
    }

    public final boolean e(enh enhVar) {
        return enhVar != null && this.i.contains(enhVar);
    }

    public final boolean f(eni eniVar) {
        return eniVar != null && this.j.contains(eniVar);
    }

    public enl(enl enlVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        TreeSet treeSet = new TreeSet();
        this.d = treeSet;
        ArrayList arrayList3 = new ArrayList();
        this.e = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f = arrayList4;
        TreeSet treeSet2 = new TreeSet();
        this.g = treeSet2;
        EnumSet enumSetNoneOf = EnumSet.noneOf(enj.class);
        this.h = enumSetNoneOf;
        EnumSet enumSetNoneOf2 = EnumSet.noneOf(enh.class);
        this.i = enumSetNoneOf2;
        EnumSet enumSetNoneOf3 = EnumSet.noneOf(eni.class);
        this.j = enumSetNoneOf3;
        EnumSet enumSetNoneOf4 = EnumSet.noneOf(enk.class);
        this.k = enumSetNoneOf4;
        EnumSet enumSetNoneOf5 = EnumSet.noneOf(eng.class);
        this.l = enumSetNoneOf5;
        arrayList.addAll(enlVar.b);
        arrayList2.addAll(enlVar.c);
        treeSet.addAll(enlVar.d);
        arrayList3.addAll(enlVar.e);
        arrayList4.addAll(enlVar.f);
        treeSet2.addAll(enlVar.g);
        enumSetNoneOf.addAll(enlVar.h);
        enumSetNoneOf2.addAll(enlVar.i);
        enumSetNoneOf3.addAll(enlVar.j);
        enumSetNoneOf4.addAll(enlVar.k);
        enumSetNoneOf5.addAll(enlVar.l);
        this.m = enlVar.m;
        this.o = enlVar.o;
        this.n = enlVar.n;
        this.p = enlVar.p;
        this.q = enlVar.q;
        this.r = enlVar.r;
        this.s = enlVar.s;
        this.t = enlVar.t;
        this.u = enlVar.u;
        this.v = enlVar.v;
        this.w = enlVar.w;
    }
}
