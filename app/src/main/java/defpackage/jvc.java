package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvc {
    public final Optional a;

    public jvc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvc) {
            return this.a.equals(((jvc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public jvc(Optional optional) {
        this.a = optional;
    }

    public final String toString() {
        return ibINv.GSoYNgHVAyAz + String.valueOf(this.a) + "}";
    }
}
