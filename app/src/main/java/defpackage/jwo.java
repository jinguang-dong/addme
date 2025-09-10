package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwo {
    public final Optional a;
    private final Optional b;

    public jwo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwo) {
            jwo jwoVar = (jwo) obj;
            if (this.a.equals(jwoVar.a) && this.b.equals(jwoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public jwo(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public final String toString() {
        Optional optional = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional) + KsvNaXS.NQFBTNyslfvApvv;
    }
}
