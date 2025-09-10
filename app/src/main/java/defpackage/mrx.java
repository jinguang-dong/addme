package defpackage;

import android.view.Window;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mrx extends mru {
    private final owq a;
    private final Window b;
    private final mzz c;
    public final fvu d;
    public final ndj e;
    public final mts f;
    public final jjn g;
    public final krj h;
    public final mte i;
    private final pfl j;

    public mrx(owq owqVar, fvu fvuVar, ndj ndjVar, Window window, mts mtsVar, pfl pflVar, krj krjVar, mzz mzzVar, mte mteVar, jjn jjnVar) {
        this.a = owqVar;
        this.d = fvuVar;
        this.e = ndjVar;
        this.b = window;
        this.f = mtsVar;
        this.j = pflVar;
        nkw nkwVar = nkw.IMAGE_INTENT;
        fvuVar.y(nkwVar);
        ndjVar.aw(nkwVar);
        this.h = krjVar;
        this.c = mzzVar;
        this.i = mteVar;
        this.g = jjnVar;
    }

    @Override // defpackage.mru, defpackage.mcz, defpackage.mda
    public void a() {
        Window window = this.b;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
        this.j.o();
        this.a.a(nkw.IMAGE_INTENT);
        this.c.f();
    }

    @Override // defpackage.mru, defpackage.mcz, defpackage.mda
    public void b() {
        this.c.n();
    }
}
