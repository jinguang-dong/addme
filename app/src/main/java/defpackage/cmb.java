package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmb {
    public final Resources a;
    public final Resources.Theme b;

    public cmb(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmb cmbVar = (cmb) obj;
            if (this.a.equals(cmbVar.a) && Objects.equals(this.b, cmbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
