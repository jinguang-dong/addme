package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fai implements eqi {
    private final Object b;

    public fai(Object obj) {
        eoz.k(obj);
        this.b = obj;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof fai) {
            return this.b.equals(((fai) obj).b);
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
