package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ujg implements Serializable, ukw {
    public static final Object d = ujf.a;
    private transient ukw a;
    private final Class b;
    private final boolean c;
    protected final Object e;
    public final String f;
    public final String g;

    protected ujg(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.b = cls;
        this.f = str;
        this.g = str2;
        this.c = z;
    }

    public final ukw c() {
        ukw ukwVar = this.a;
        if (ukwVar != null) {
            return ukwVar;
        }
        g();
        this.a = this;
        return this;
    }

    public final uky e() {
        Class cls = this.b;
        if (cls == null) {
            return null;
        }
        if (this.c) {
            int i = ukb.a;
            return new ujt(cls);
        }
        int i2 = ukb.a;
        return new uji(cls);
    }

    @Override // defpackage.ukw
    public final Object f() {
        throw null;
    }

    protected abstract void g();
}
