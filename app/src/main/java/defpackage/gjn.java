package defpackage;

import android.view.Window;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gjn extends gjy {
    private final Window a;
    private final mzz b;
    private final pfl c;
    public final fvu e;
    public final ndj f;
    public final mts g;
    public gjy h;
    public final mte i;
    public final gtm j;

    public gjn(fvu fvuVar, ndj ndjVar, Window window, mts mtsVar, pfl pflVar, mzz mzzVar, gtm gtmVar, mte mteVar) {
        this.e = fvuVar;
        this.f = ndjVar;
        this.a = window;
        this.g = mtsVar;
        this.c = pflVar;
        this.b = mzzVar;
        this.j = gtmVar;
        this.i = mteVar;
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public void a() {
        this.c.o();
        fvu fvuVar = this.e;
        nkw nkwVar = nkw.VIDEO_INTENT;
        fvuVar.y(nkwVar);
        this.f.aw(nkwVar);
        Window window = this.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
        this.b.f();
        this.g.d(true);
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public void b() {
        this.b.n();
    }

    @Override // defpackage.gjw
    public final int e() {
        this.h.e();
        return this.h.e();
    }
}
