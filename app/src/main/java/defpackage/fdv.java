package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fdv implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fdv(fdy fdyVar, int i) {
        this.b = i;
        this.a = fdyVar;
    }

    public fdv(uh uhVar, int i) {
        this.b = i;
        this.a = uhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                ((feb) ((uh) this.a).f).a("CaptureModule: Out of storage space on device.");
                return;
            } else {
                ((fdy) this.a).b.a("Required camera permissions were not granted.");
                return;
            }
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        fdy fdyVar = (fdy) this.a;
        intent.setData(Uri.parse(HHdu.KiDDbyrKJDCwfJ.concat(String.valueOf(fdyVar.a.getPackageName()))));
        fdyVar.j.h(intent);
        fdyVar.b.a("Closing until required permissions are granted.");
    }
}
