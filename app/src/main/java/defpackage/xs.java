package defpackage;

import android.media.Image;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xs implements xr, xt {
    private final xr a;
    private final uly b = new uly(false, umc.a);
    private final tdy c;

    public xs(xr xrVar, tdy tdyVar) {
        this.a = xrVar;
        this.c = tdyVar;
    }

    @Override // defpackage.xt
    public final xt a() {
        ulz ulzVar;
        int i;
        int i2;
        xs xsVar = null;
        if (!this.b.a()) {
            tdy tdyVar = this.c;
            do {
                ulzVar = (ulz) tdyVar.b;
                i = ulzVar.b;
                i2 = i == 0 ? 0 : i + 1;
            } while (!ulzVar.c(i, i2));
            if ((i2 != 0 ? tdyVar.a : null) != null) {
                xsVar = new xs(this.a, tdyVar);
            }
        }
        if (xsVar != null) {
            return xsVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        if (this.b.a()) {
            return null;
        }
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(xt.class)) || a.ao(ukxVar, new uji(xr.class)) || a.ao(ukxVar, new uji(xo.class))) {
            return this;
        }
        if (a.ao(ukxVar, new uji(Image.class))) {
            throw new UnsupportedOperationException(a.bz(this, "Cannot unwrap ", " as android.media.Image. Use setFinalizerinstead and close all outstanding references."));
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.b()) {
            tdy tdyVar = this.c;
            if (((ulz) tdyVar.b).a() == 0) {
                xm xmVar = (xm) ((umb) tdyVar.c).a(null);
                xmVar.getClass();
                xmVar.a(tdyVar.a);
            }
        }
    }
}
