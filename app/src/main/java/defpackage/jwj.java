package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwj {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;

    public jwj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwj) {
            jwj jwjVar = (jwj) obj;
            if (this.a.equals(jwjVar.a) && this.b.equals(jwjVar.b) && this.c.equals(jwjVar.c) && this.d.equals(jwjVar.d) && this.e.equals(jwjVar.e) && this.f.equals(jwjVar.f) && this.g.equals(jwjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        return this.g.hashCode() ^ (iHashCode * 1000003);
    }

    public jwj(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
    }

    public final String toString() {
        Optional optional = this.g;
        Optional optional2 = this.f;
        Optional optional3 = this.e;
        Optional optional4 = this.d;
        Optional optional5 = this.c;
        Optional optional6 = this.b;
        return INRGuObcrHjSQz.Yhzk + String.valueOf(this.a) + ", " + String.valueOf(optional6) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }
}
