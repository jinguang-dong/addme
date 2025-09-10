package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import j$.util.Collection;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jko implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jko(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return Boolean.valueOf(((Optional) ((jkq) this.a).d.dL()).isPresent());
        }
        if (i == 1) {
            return (gpr) ((sbp) this.a).get(0);
        }
        if (i == 2) {
            return Boolean.valueOf(!((jmo) this.a).b.get());
        }
        if (i == 3) {
            return Boolean.valueOf(((mcl) this.a).j());
        }
        if (i == 4) {
            return Boolean.valueOf(((mco) this.a).d());
        }
        if (i != 5) {
            return Collection.EL.stream(this.a).filter(new mdn(14)).findFirst();
        }
        Object obj = this.a;
        try {
            hbw hbwVar = ((moi) obj).d;
            int iA = hbwVar.a();
            fqb fqbVarL = hbwVar.l();
            DisplayMetrics displayMetrics = ((moi) obj).b.getDisplayMetrics();
            qev qevVarH = fqbVarL != null ? fqbVarL.h((int) (displayMetrics.widthPixels * 0.7d), (int) (displayMetrics.heightPixels * 0.7d)) : null;
            if (qevVarH != null) {
                Object obj2 = qevVarH.b;
                if (((rwc) obj2).h()) {
                    Bitmap bitmap = (Bitmap) ((rwc) obj2).c();
                    bitmap.getWidth();
                    bitmap.getHeight();
                    return new mog(bitmap, qevVarH.a);
                }
            }
            return iA == 0 ? new mog(mog.a, 0) : new mog(null, 0);
        } catch (RuntimeException e) {
            ((sgt) ((sgt) moi.a.c().i(e)).M((char) 4962)).s("exception generating thumbnail");
            return new mog(mog.a, 0);
        }
    }
}
