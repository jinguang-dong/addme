package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kha implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public kha(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kgz] */
    @Override // java.lang.Runnable
    public final void run() {
        fz fzVar;
        int i = this.b;
        try {
            if (i == 0) {
                try {
                    ?? r0 = ((khb) this.a).c;
                    ?? r2 = this.c;
                    r0.f(eld.b(r2, "Command#"));
                    r2.a();
                } catch (InterruptedException | pco unused) {
                } catch (Exception e) {
                    ((out) ((khb) this.a).d).execute(new kdx(e, 4, null));
                }
                return;
            }
            if (i == 1) {
                hg hgVar = (hg) this.a;
                gb gbVar = hgVar.c;
                if (gbVar != null && (fzVar = gbVar.b) != null) {
                    fzVar.D(gbVar);
                }
                View view = (View) hgVar.f;
                if (view != null && view.getWindowToken() != null) {
                    Object obj = this.c;
                    if (((gk) obj).h()) {
                        hgVar.i = (hf) obj;
                    }
                }
                hgVar.k = null;
                return;
            }
            ?? r02 = this.a;
            ofq ofqVar = (ofq) r02;
            if (ofqVar.a) {
                qev qevVar = (qev) this.c;
                odj odjVar = (odj) qevVar.b;
                if (odjVar.b()) {
                    ogi ogiVar = ofqVar.f;
                    Activity activityL = ((ogh) r02).l();
                    PendingIntent pendingIntent = odjVar.d;
                    ojl.ay(pendingIntent);
                    ogiVar.startActivityForResult(GoogleApiActivity.a(activityL, pendingIntent, qevVar.a, false), 1);
                    return;
                }
                odn odnVar = ofqVar.d;
                ogh oghVar = (ogh) r02;
                Activity activityL2 = oghVar.l();
                int i2 = odjVar.c;
                if (odnVar.g(activityL2, i2, null) != null) {
                    Activity activityL3 = oghVar.l();
                    Dialog dialogB = odnVar.b(activityL3, i2, new ohu(odnVar.g(activityL3, i2, "d"), ofqVar.f), r02);
                    if (dialogB != null) {
                        odnVar.a(activityL3, dialogB, "GooglePlayServicesErrorDialog", r02);
                        return;
                    }
                    return;
                }
                if (i2 != 18) {
                    ofqVar.a(odjVar, qevVar.a);
                    return;
                }
                Activity activityL4 = oghVar.l();
                ProgressBar progressBar = new ProgressBar(activityL4, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(activityL4);
                builder.setView(progressBar);
                builder.setMessage(ohq.b(activityL4, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog alertDialogCreate = builder.create();
                odnVar.a(activityL4, alertDialogCreate, "GooglePlayServicesUpdatingDialog", r02);
                Context applicationContext = oghVar.l().getApplicationContext();
                oge ogeVar = new oge(this, alertDialogCreate);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                ogf ogfVar = new ogf(ogeVar);
                clu.d(applicationContext, ogfVar, intentFilter, 2);
                ogfVar.a = applicationContext;
                if (oef.d(applicationContext)) {
                    return;
                }
                ogeVar.a();
                ogfVar.a();
            }
        } finally {
            ((khb) this.a).c.g();
        }
    }
}
