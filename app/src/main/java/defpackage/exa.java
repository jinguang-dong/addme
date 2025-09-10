package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exa implements eqq {
    private final eqq b;
    private final boolean c;

    public exa(eqq eqqVar, boolean z) {
        this.b = eqqVar;
        this.c = z;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.eqq
    public final esw b(Context context, esw eswVar, int i, int i2) {
        ete eteVar = eox.b(context).a;
        Drawable drawable = (Drawable) eswVar.c();
        esw eswVarA = ewz.a(eteVar, drawable, i, i2);
        if (eswVarA == null) {
            if (this.c) {
                throw new IllegalArgumentException(mn.i(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return eswVar;
        }
        esw eswVarB = this.b.b(context, eswVarA, i, i2);
        if (!eswVarB.equals(eswVarA)) {
            return exg.f(context.getResources(), eswVarB);
        }
        eswVarB.e();
        return eswVar;
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof exa) {
            return this.b.equals(((exa) obj).b);
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return this.b.hashCode();
    }
}
