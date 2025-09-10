package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.widget.CircularProgressLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyt {
    public boolean a;
    public final Object b;

    public nyt(View view) {
        this.b = view;
    }

    public final synchronized void a(esw eswVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            eswVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, eswVar).sendToTarget();
    }

    public final void b(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (z) {
            ((CircularProgressLayout) this.b).a.start();
        } else {
            ((CircularProgressLayout) this.b).a.stop();
        }
    }

    public final void c() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    public final void d(AttributeSet attributeSet) {
        int iX;
        int iX2;
        Object obj = this.b;
        CheckedTextView checkedTextView = (CheckedTextView) obj;
        Context context = checkedTextView.getContext();
        int[] iArr = fa.l;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        Object obj2 = pmgVarJ.b;
        Context context2 = checkedTextView.getContext();
        int[] iArr2 = con.a;
        col.b((View) obj, context2, iArr, attributeSet, (TypedArray) obj2, R.attr.checkedTextViewStyle, 0);
        try {
            if (pmgVarJ.F(1) && (iX2 = pmgVarJ.x(1, 0)) != 0) {
                try {
                    ((CheckedTextView) obj).setCheckMarkDrawable(byi.bJ(((CheckedTextView) obj).getContext(), iX2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (pmgVarJ.F(0) && (iX = pmgVarJ.x(0, 0)) != 0) {
                Object obj3 = this.b;
                ((CheckedTextView) obj3).setCheckMarkDrawable(byi.bJ(((CheckedTextView) obj3).getContext(), iX));
            }
            if (pmgVarJ.F(2)) {
                ((CheckedTextView) this.b).setCheckMarkTintList(pmgVarJ.y(2));
            }
            if (pmgVarJ.F(3)) {
                Object obj4 = this.b;
                int iU = pmgVarJ.u(3, -1);
                Rect rect = je.a;
                ((CheckedTextView) obj4).setCheckMarkTintMode(a.n(iU, null));
            }
        } finally {
            pmgVarJ.D();
        }
    }

    public nyt() {
        this.b = new Handler(Looper.getMainLooper(), new esz());
    }

    public nyt(Handler handler, AmbientModeSupport.AmbientController ambientController) {
        this.b = new nys(handler, ambientController);
    }
}
