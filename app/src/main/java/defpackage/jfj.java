package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfj implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public jfj(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z, int i, int i2) {
        this.d = i2;
        this.a = z;
        this.b = i;
        this.c = photoSphereMessageOverlay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        if (this.d == 0) {
            TextView textView = (TextView) ((PhotoSphereMessageOverlay) this.c).findViewById(R.id.long_message_overlay);
            if (!this.a) {
                textView.setVisibility(4);
                return;
            }
            textView.setVisibility(0);
            int i2 = this.b;
            if (i2 == 0) {
                textView.setText(R.string.photosphere_calibration_step_one);
                return;
            }
            if (i2 == 1) {
                textView.setText(R.string.photosphere_calibration_step_two);
                return;
            } else if (i2 == 2) {
                textView.setText(R.string.photosphere_calibration_step_three);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                textView.setText(R.string.photosphere_calibration_finished);
                return;
            }
        }
        Object obj = this.c;
        fdx fdxVar = new fdx(obj, i);
        DialogInterface.OnClickListener onClickListener = this.a ? null : ((fdy) obj).f;
        out.a();
        fdy fdyVar = (fdy) obj;
        fdyVar.a();
        AtomicInteger atomicInteger = fdyVar.d;
        if (atomicInteger.get() != 0) {
            atomicInteger.get();
            return;
        }
        final DialogInterface.OnClickListener onClickListener2 = fdyVar.e;
        int i3 = this.b;
        Activity activity = fdyVar.a;
        rkc rkcVar = new rkc(activity, R.style.Theme_Camera_MaterialAlertDialog);
        rkcVar.t(activity.getString(R.string.camera_permissions_error_title));
        rkcVar.m(activity.getString(i3));
        rkcVar.k(false);
        rkcVar.p(new DialogInterface.OnKeyListener() { // from class: fdw
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                if (i4 != 4) {
                    return false;
                }
                onClickListener2.onClick(dialogInterface, -2);
                return true;
            }
        });
        rkcVar.a.l = fdxVar;
        rkcVar.o(activity.getString(R.string.dialog_dismiss), onClickListener2);
        if (onClickListener != null) {
            rkcVar.r(activity.getString(R.string.camera_menu_settings_label), onClickListener);
        }
        fdyVar.i = rkcVar.c();
    }

    public /* synthetic */ jfj(fdy fdyVar, int i, boolean z, int i2) {
        this.d = i2;
        this.c = fdyVar;
        this.b = i;
        this.a = z;
    }
}
