package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class olc extends olg {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;

    public olc(Intent intent, WeakReference weakReference) {
        this.a = intent;
        this.b = weakReference;
    }

    @Override // defpackage.olg
    public final void b(GoogleHelp googleHelp) {
        oiz oizVar;
        ViewGroup viewGroup;
        Intent intent = this.a;
        intent.putExtra("EXTRA_START_TICK", System.nanoTime());
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            return;
        }
        googleHelp.z = odn.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            String string = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        string = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = string;
        }
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = ola.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            if (byteArrayExtra == null) {
                oizVar = null;
            } else {
                ojl.ay(creator);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                parcelObtain.setDataPosition(0);
                oizVar = (oiz) creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
            }
            ola olaVar = (ola) oizVar;
            olaVar.a = googleHelp;
            Parcel parcelObtain2 = Parcel.obtain();
            okg.b(olaVar, parcelObtain2, 0);
            byte[] bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", bArrMarshall);
        }
        new ols(Looper.getMainLooper()).post(new nzq(activity, intent, 11, (byte[]) null));
    }
}
