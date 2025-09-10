package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjo {
    public final Context a;
    public final mni b;
    public final out c;
    public final owq d;
    public ksa e = ksa.BEAUTIFICATION_OFF;
    public int f = -1;

    public hjo(Context context, mni mniVar, out outVar, owq owqVar) {
        this.a = context;
        this.b = mniVar;
        this.c = outVar;
        this.d = owqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.widget.FrameLayout[] r5, defpackage.ksa r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 3
            if (r1 >= r2) goto L2a
            ksa r2 = defpackage.ksa.BEAUTIFICATION_OFF
            r3 = 1
            if (r6 != r2) goto L10
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            r1 = r0
            r4 = r1
            goto L23
        L10:
            ksa r2 = defpackage.ksa.BEAUTIFICATION_ON_LIGHT
            if (r6 != r2) goto L19
            if (r1 == r3) goto L17
            goto L19
        L17:
            r4 = r0
            goto L23
        L19:
            ksa r2 = defpackage.ksa.BEAUTIFICATION_ON_STRONG
            r4 = 8
            if (r6 != r2) goto L23
            r2 = 2
            if (r1 != r2) goto L23
            goto L17
        L23:
            r2 = r5[r1]
            r2.setVisibility(r4)
            int r1 = r1 + r3
            goto L2
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjo.a(android.widget.FrameLayout[], ksa):void");
    }

    public static void b(ksa ksaVar, ImageView imageView, ImageView imageView2, ImageView imageView3, int i, int i2) {
        if (imageView == null || imageView2 == null || imageView3 == null) {
            return;
        }
        imageView.setColorFilter(ksaVar == ksa.BEAUTIFICATION_OFF ? i : i2);
        imageView2.setColorFilter(ksaVar == ksa.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (ksaVar != ksa.BEAUTIFICATION_ON_STRONG) {
            i = i2;
        }
        imageView3.setColorFilter(i);
    }

    public static void c(ksa ksaVar, TextView textView, TextView textView2, TextView textView3, int i, int i2) {
        if (textView == null || textView2 == null || textView3 == null) {
            return;
        }
        textView.setTextColor(ksaVar == ksa.BEAUTIFICATION_OFF ? i : i2);
        textView2.setTextColor(ksaVar == ksa.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (ksaVar != ksa.BEAUTIFICATION_ON_STRONG) {
            i = i2;
        }
        textView3.setTextColor(i);
    }

    public static void d(ksa ksaVar, View view, View view2, View view3) {
        ksa ksaVar2 = ksa.BEAUTIFICATION_OFF;
        int i = R.drawable.retouching_edu_option_selected;
        view.setBackgroundResource(ksaVar == ksaVar2 ? R.drawable.retouching_edu_option_selected : R.drawable.retouching_edu_option_unselected);
        view2.setBackgroundResource(ksaVar == ksa.BEAUTIFICATION_ON_LIGHT ? R.drawable.retouching_edu_option_selected : R.drawable.retouching_edu_option_unselected);
        if (ksaVar != ksa.BEAUTIFICATION_ON_STRONG) {
            i = R.drawable.retouching_edu_option_unselected;
        }
        view3.setBackgroundResource(i);
    }
}
