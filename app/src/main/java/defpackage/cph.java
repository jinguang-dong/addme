package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class cph extends cpg {
    public cph(cpp cppVar, WindowInsets windowInsets) {
        super(cppVar, windowInsets);
    }

    @Override // defpackage.cpf, defpackage.cpm
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cph)) {
            return false;
        }
        cph cphVar = (cph) obj;
        return Objects.equals(this.a, cphVar.a) && Objects.equals(this.b, cphVar.b) && n(this.c, cphVar.c);
    }

    @Override // defpackage.cpm
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cpm
    public cnq s() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new cnq(displayCutout);
    }

    @Override // defpackage.cpm
    public cpp t() {
        return cpp.n(this.a.consumeDisplayCutout());
    }
}
