package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjd implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rjd(nyn nynVar, int i) {
        this.b = i;
        this.a = nynVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            AmbientModeSupport.AmbientController ambientController = ((nyn) this.a).e;
            if (ambientController == null) {
                return;
            }
            ambientController.g();
            return;
        }
        rjh rjhVar = (rjh) this.a;
        if (rjhVar.d && rjhVar.isShowing()) {
            if (!rjhVar.f) {
                TypedArray typedArrayObtainStyledAttributes = rjhVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                rjhVar.e = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                rjhVar.f = true;
            }
            if (rjhVar.e) {
                rjhVar.cancel();
            }
        }
    }

    public rjd(rjh rjhVar, int i) {
        this.b = i;
        this.a = rjhVar;
    }
}
