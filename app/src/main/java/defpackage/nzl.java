package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzl {
    public final URI a;
    public final sci b;
    public final nzh c;
    public final int d;
    public final nzb e;
    public final rdf f;
    public final AmbientModeSupport.AmbientController g;

    public nzl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        AmbientModeSupport.AmbientController ambientController;
        nzb nzbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzl) {
            nzl nzlVar = (nzl) obj;
            if (this.a.equals(nzlVar.a) && this.b.equals(nzlVar.b) && this.c.equals(nzlVar.c) && ((ambientController = this.g) != null ? ambientController.equals(nzlVar.g) : nzlVar.g == null) && this.f.equals(nzlVar.f) && this.d == nzlVar.d && ((nzbVar = this.e) != null ? nzbVar.equals(nzlVar.e) : nzlVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        AmbientModeSupport.AmbientController ambientController = this.g;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (ambientController == null ? 0 : ambientController.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.d) * 1000003;
        nzb nzbVar = this.e;
        return (iHashCode2 ^ (nzbVar != null ? nzbVar.hashCode() : 0)) * 583896283;
    }

    public final String toString() {
        nzb nzbVar = this.e;
        rdf rdfVar = this.f;
        AmbientModeSupport.AmbientController ambientController = this.g;
        nzh nzhVar = this.c;
        sci sciVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(sciVar) + ", " + String.valueOf(nzhVar) + ", " + String.valueOf(ambientController) + ", " + String.valueOf(rdfVar) + ", " + this.d + ", " + String.valueOf(nzbVar) + ", null, null, null}";
    }

    public nzl(URI uri, sci sciVar, nzh nzhVar, AmbientModeSupport.AmbientController ambientController, rdf rdfVar, int i, nzb nzbVar) {
        this.a = uri;
        this.b = sciVar;
        this.c = nzhVar;
        this.g = ambientController;
        this.f = rdfVar;
        this.d = i;
        this.e = nzbVar;
    }
}
