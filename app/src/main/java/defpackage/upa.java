package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upa extends uvr implements uoh {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object objF = f();
        objF.getClass();
        boolean z = true;
        for (uvt uvtVarH = (uvt) objF; !a.ao(uvtVarH, this); uvtVarH = uvtVarH.h()) {
            if (uvtVarH instanceof uoo) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(uvtVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.uoh
    public final boolean fM() {
        return true;
    }

    @Override // defpackage.uvt
    public final String toString() {
        return unf.a ? c("Active") : super.toString();
    }

    @Override // defpackage.uoh
    public final upa fK() {
        return this;
    }
}
