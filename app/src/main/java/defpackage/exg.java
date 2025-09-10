package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exg implements esw, est {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public exg(Bitmap bitmap, ete eteVar, int i) {
        this.a = i;
        eoz.j(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        this.c = eteVar;
    }

    public static esw f(Resources resources, esw eswVar) {
        if (eswVar == null) {
            return null;
        }
        return new exg(resources, eswVar, 0);
    }

    public static exg g(Bitmap bitmap, ete eteVar) {
        if (bitmap == null) {
            return null;
        }
        return new exg(bitmap, eteVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [esw, java.lang.Object] */
    @Override // defpackage.esw
    public final int a() {
        return this.a != 0 ? fax.a((Bitmap) this.b) : this.c.a();
    }

    @Override // defpackage.esw
    public final Class b() {
        return this.a != 0 ? Bitmap.class : BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [esw, java.lang.Object] */
    @Override // defpackage.esw
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.est
    public final void d() {
        if (this.a != 0) {
            ((Bitmap) this.b).prepareToDraw();
            return;
        }
        Object obj = this.c;
        if (obj instanceof est) {
            ((est) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ete, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [esw, java.lang.Object] */
    @Override // defpackage.esw
    public final void e() {
        if (this.a != 0) {
            this.c.d((Bitmap) this.b);
        } else {
            this.c.e();
        }
    }

    private exg(Resources resources, esw eswVar, int i) {
        this.a = i;
        eoz.k(resources);
        this.b = resources;
        eoz.k(eswVar);
        this.c = eswVar;
    }
}
