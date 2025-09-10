package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcf {
    public final dco a;
    public final ddi b;
    public final Map c;
    public final ReentrantLock d;
    public final uif e;
    public final uif f;
    public final Object g;
    public cpn h;
    private final Map i;
    private final Map j;
    private final String[] k;

    public dcf(dco dcoVar, Map map, Map map2, String... strArr) {
        this.a = dcoVar;
        this.i = map;
        this.j = map2;
        this.k = strArr;
        ddi ddiVar = new ddi(dcoVar, map, map2, strArr, dcoVar.h, new aek((Object) this, 3, (short[]) null));
        this.b = ddiVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new bfw(6);
        this.f = new bfw(7);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        ddiVar.e = new apa(this, 13);
    }

    public final Object a(uhb uhbVar) {
        Object objE = this.b.e(uhbVar);
        return objE == uhi.a ? objE : ufg.a;
    }

    public final void b() {
        this.b.f(this.e, this.f);
    }
}
