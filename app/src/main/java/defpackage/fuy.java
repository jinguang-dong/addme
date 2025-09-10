package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuy {
    public final rwu a;
    public final rxc b;
    public final Map c = new ConcurrentHashMap();
    public long d = 0;
    public long e = 0;
    public int f = 0;
    public final pfl g;

    public fuy(pfl pflVar, rxc rxcVar) {
        this.g = pflVar;
        this.b = rxcVar;
        this.a = new rwu(rxcVar);
    }
}
