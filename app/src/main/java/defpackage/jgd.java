package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBar;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jgd implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jgd(int i, String[] strArr, int[] iArr, int i2) {
        this.d = i2;
        this.a = i;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        int i = this.d;
        if (i == 0) {
            jhh jhhVar = (jhh) obj;
            int i2 = jgt.f;
            if (jhhVar instanceof fdy) {
                Object obj2 = this.c;
                fdy fdyVar = (fdy) jhhVar;
                fdyVar.c(this.a, (String[]) this.b, (int[]) obj2);
                return;
            }
            return;
        }
        if (i != 1) {
            ((lst) obj).g((ltd) this.b, (Bitmap) this.c, this.a);
            return;
        }
        View view = (View) obj;
        if (view.getMeasuredHeight() > this.a) {
            Object obj3 = this.c;
            cku ckuVar = (cku) obj3;
            ckuVar.k(view.getId(), ((BottomBar) this.b).g());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.d;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ jgd(BottomBar bottomBar, int i, cku ckuVar, int i2) {
        this.d = i2;
        this.b = bottomBar;
        this.a = i;
        this.c = ckuVar;
    }

    public /* synthetic */ jgd(ltd ltdVar, Bitmap bitmap, int i, int i2) {
        this.d = i2;
        this.b = ltdVar;
        this.c = bitmap;
        this.a = i;
    }
}
