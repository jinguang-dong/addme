package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class god implements syf {
    final /* synthetic */ pka a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ gtm f;

    public god(gtm gtmVar, pka pkaVar, int i, int i2, int i3, int i4) {
        this.a = pkaVar;
        this.d = i;
        this.e = i2;
        this.b = i3;
        this.c = i4;
        this.f = gtmVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        throw new hgx("Failed to open any of the available camera", pbw.CAMERA_ERROR_CODE_UNKNOWN, this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pbc] */
    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        dv dvVarB;
        gpa gpaVar = (gpa) obj;
        final int iB = ezh.B(gpaVar, this.b, this.c);
        String string = gpaVar.toString();
        final gtm gtmVar = this.f;
        gtmVar.b.b(string);
        final pka pkaVar = this.a;
        final int i = this.d;
        final int i2 = this.e;
        if (iB == 4) {
            final gtm gtmVar2 = (gtm) gtmVar.e;
            Context context = (Context) gtmVar2.d;
            rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
            TextView textViewY = ezh.y(context);
            textViewY.setText(R.string.camera_issue_contact_message);
            rkcVar.t(context.getResources().getString(R.string.camera_issue_title));
            rkcVar.u(textViewY);
            final int i3 = 4;
            rkcVar.q(R.string.contact_us, new DialogInterface.OnClickListener() { // from class: goa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    int i5 = i3;
                    if (i5 == 0) {
                        int i6 = i2;
                        int i7 = i;
                        gtmVar2.c(pkaVar, i7, i6, 3);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i5 == 1) {
                        int i8 = i2;
                        int i9 = i;
                        pka pkaVar2 = pkaVar;
                        gtm gtmVar3 = gtmVar2;
                        gtmVar3.d(pkaVar2, i9, i8, 3);
                        dialogInterface.dismiss();
                        ((feb) gtmVar3.a).a(String.valueOf(String.valueOf(pkaVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i5 == 2) {
                        int i10 = i2;
                        int i11 = i;
                        pka pkaVar3 = pkaVar;
                        gtm gtmVar4 = gtmVar2;
                        gtmVar4.d(pkaVar3, i11, i10, 5);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.a).a(String.valueOf(String.valueOf(pkaVar3)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i5 == 3) {
                        int i12 = i2;
                        int i13 = i;
                        gtmVar2.c(pkaVar, i13, i12, 5);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i5 != 4) {
                        int i14 = i2;
                        int i15 = i;
                        gtmVar2.c(pkaVar, i15, i14, 4);
                        dialogInterface.dismiss();
                        return;
                    }
                    int i16 = i2;
                    int i17 = i;
                    pka pkaVar4 = pkaVar;
                    gtm gtmVar5 = gtmVar2;
                    gtmVar5.d(pkaVar4, i17, i16, 4);
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.c).u()));
                }
            });
            final int i4 = 5;
            rkcVar.n(R.string.continue_anyway, new DialogInterface.OnClickListener() { // from class: goa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    int i5 = i4;
                    if (i5 == 0) {
                        int i6 = i2;
                        int i7 = i;
                        gtmVar2.c(pkaVar, i7, i6, 3);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i5 == 1) {
                        int i8 = i2;
                        int i9 = i;
                        pka pkaVar2 = pkaVar;
                        gtm gtmVar3 = gtmVar2;
                        gtmVar3.d(pkaVar2, i9, i8, 3);
                        dialogInterface.dismiss();
                        ((feb) gtmVar3.a).a(String.valueOf(String.valueOf(pkaVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i5 == 2) {
                        int i10 = i2;
                        int i11 = i;
                        pka pkaVar3 = pkaVar;
                        gtm gtmVar4 = gtmVar2;
                        gtmVar4.d(pkaVar3, i11, i10, 5);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.a).a(String.valueOf(String.valueOf(pkaVar3)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i5 == 3) {
                        int i12 = i2;
                        int i13 = i;
                        gtmVar2.c(pkaVar, i13, i12, 5);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i5 != 4) {
                        int i14 = i2;
                        int i15 = i;
                        gtmVar2.c(pkaVar, i15, i14, 4);
                        dialogInterface.dismiss();
                        return;
                    }
                    int i16 = i2;
                    int i17 = i;
                    pka pkaVar4 = pkaVar;
                    gtm gtmVar5 = gtmVar2;
                    gtmVar5.d(pkaVar4, i17, i16, 4);
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.c).u()));
                }
            });
            dvVarB = rkcVar.b();
        } else if (iB == 3) {
            final gtm gtmVar3 = (gtm) gtmVar.e;
            Context context2 = (Context) gtmVar3.d;
            rkc rkcVar2 = new rkc(context2, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar2.t(context2.getResources().getString(R.string.camera_issue_title));
            final int i5 = 3;
            rkcVar2.u(ezh.z(R.string.camera_issue_reboot_message, context2, new Runnable() { // from class: gob
                @Override // java.lang.Runnable
                public final void run() throws PackageManager.NameNotFoundException {
                    int i6 = fed.a;
                    gtm gtmVar4 = gtmVar3;
                    Activity activity = (Activity) gtmVar4.e;
                    Context applicationContext = activity.getApplicationContext();
                    activity.getPackageName();
                    fed.b(applicationContext, activity);
                    gtmVar4.b(pkaVar, i, i2, i5, 5);
                }
            }));
            final int i6 = 1;
            rkcVar2.q(R.string.camera_fallback_close_app, new DialogInterface.OnClickListener() { // from class: goa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    int i52 = i6;
                    if (i52 == 0) {
                        int i62 = i2;
                        int i7 = i;
                        gtmVar3.c(pkaVar, i7, i62, 3);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 == 1) {
                        int i8 = i2;
                        int i9 = i;
                        pka pkaVar2 = pkaVar;
                        gtm gtmVar32 = gtmVar3;
                        gtmVar32.d(pkaVar2, i9, i8, 3);
                        dialogInterface.dismiss();
                        ((feb) gtmVar32.a).a(String.valueOf(String.valueOf(pkaVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 2) {
                        int i10 = i2;
                        int i11 = i;
                        pka pkaVar3 = pkaVar;
                        gtm gtmVar4 = gtmVar3;
                        gtmVar4.d(pkaVar3, i11, i10, 5);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.a).a(String.valueOf(String.valueOf(pkaVar3)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 3) {
                        int i12 = i2;
                        int i13 = i;
                        gtmVar3.c(pkaVar, i13, i12, 5);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 != 4) {
                        int i14 = i2;
                        int i15 = i;
                        gtmVar3.c(pkaVar, i15, i14, 4);
                        dialogInterface.dismiss();
                        return;
                    }
                    int i16 = i2;
                    int i17 = i;
                    pka pkaVar4 = pkaVar;
                    gtm gtmVar5 = gtmVar3;
                    gtmVar5.d(pkaVar4, i17, i16, 4);
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.c).u()));
                }
            });
            final int i7 = 0;
            rkcVar2.n(R.string.continue_anyway, new DialogInterface.OnClickListener() { // from class: goa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    int i52 = i7;
                    if (i52 == 0) {
                        int i62 = i2;
                        int i72 = i;
                        gtmVar3.c(pkaVar, i72, i62, 3);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 == 1) {
                        int i8 = i2;
                        int i9 = i;
                        pka pkaVar2 = pkaVar;
                        gtm gtmVar32 = gtmVar3;
                        gtmVar32.d(pkaVar2, i9, i8, 3);
                        dialogInterface.dismiss();
                        ((feb) gtmVar32.a).a(String.valueOf(String.valueOf(pkaVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 2) {
                        int i10 = i2;
                        int i11 = i;
                        pka pkaVar3 = pkaVar;
                        gtm gtmVar4 = gtmVar3;
                        gtmVar4.d(pkaVar3, i11, i10, 5);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.a).a(String.valueOf(String.valueOf(pkaVar3)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 3) {
                        int i12 = i2;
                        int i13 = i;
                        gtmVar3.c(pkaVar, i13, i12, 5);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 != 4) {
                        int i14 = i2;
                        int i15 = i;
                        gtmVar3.c(pkaVar, i15, i14, 4);
                        dialogInterface.dismiss();
                        return;
                    }
                    int i16 = i2;
                    int i17 = i;
                    pka pkaVar4 = pkaVar;
                    gtm gtmVar5 = gtmVar3;
                    gtmVar5.d(pkaVar4, i17, i16, 4);
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.c).u()));
                }
            });
            dvVarB = rkcVar2.b();
        } else {
            final gtm gtmVar4 = (gtm) gtmVar.e;
            Context context3 = (Context) gtmVar4.d;
            rkc rkcVar3 = new rkc(context3, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar3.t(context3.getResources().getString(R.string.camera_issue_title));
            final int i8 = 5;
            rkcVar3.u(ezh.z(R.string.camera_issue_restart_message, context3, new Runnable() { // from class: gob
                @Override // java.lang.Runnable
                public final void run() throws PackageManager.NameNotFoundException {
                    int i62 = fed.a;
                    gtm gtmVar42 = gtmVar4;
                    Activity activity = (Activity) gtmVar42.e;
                    Context applicationContext = activity.getApplicationContext();
                    activity.getPackageName();
                    fed.b(applicationContext, activity);
                    gtmVar42.b(pkaVar, i, i2, i8, 5);
                }
            }));
            final int i9 = 2;
            rkcVar3.q(R.string.camera_fallback_close_app, new DialogInterface.OnClickListener() { // from class: goa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    int i52 = i9;
                    if (i52 == 0) {
                        int i62 = i2;
                        int i72 = i;
                        gtmVar4.c(pkaVar, i72, i62, 3);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 == 1) {
                        int i82 = i2;
                        int i92 = i;
                        pka pkaVar2 = pkaVar;
                        gtm gtmVar32 = gtmVar4;
                        gtmVar32.d(pkaVar2, i92, i82, 3);
                        dialogInterface.dismiss();
                        ((feb) gtmVar32.a).a(String.valueOf(String.valueOf(pkaVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 2) {
                        int i10 = i2;
                        int i11 = i;
                        pka pkaVar3 = pkaVar;
                        gtm gtmVar42 = gtmVar4;
                        gtmVar42.d(pkaVar3, i11, i10, 5);
                        dialogInterface.dismiss();
                        ((feb) gtmVar42.a).a(String.valueOf(String.valueOf(pkaVar3)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 3) {
                        int i12 = i2;
                        int i13 = i;
                        gtmVar4.c(pkaVar, i13, i12, 5);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 != 4) {
                        int i14 = i2;
                        int i15 = i;
                        gtmVar4.c(pkaVar, i15, i14, 4);
                        dialogInterface.dismiss();
                        return;
                    }
                    int i16 = i2;
                    int i17 = i;
                    pka pkaVar4 = pkaVar;
                    gtm gtmVar5 = gtmVar4;
                    gtmVar5.d(pkaVar4, i17, i16, 4);
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.c).u()));
                }
            });
            final int i10 = 3;
            rkcVar3.n(R.string.continue_anyway, new DialogInterface.OnClickListener() { // from class: goa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    int i52 = i10;
                    if (i52 == 0) {
                        int i62 = i2;
                        int i72 = i;
                        gtmVar4.c(pkaVar, i72, i62, 3);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 == 1) {
                        int i82 = i2;
                        int i92 = i;
                        pka pkaVar2 = pkaVar;
                        gtm gtmVar32 = gtmVar4;
                        gtmVar32.d(pkaVar2, i92, i82, 3);
                        dialogInterface.dismiss();
                        ((feb) gtmVar32.a).a(String.valueOf(String.valueOf(pkaVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 2) {
                        int i102 = i2;
                        int i11 = i;
                        pka pkaVar3 = pkaVar;
                        gtm gtmVar42 = gtmVar4;
                        gtmVar42.d(pkaVar3, i11, i102, 5);
                        dialogInterface.dismiss();
                        ((feb) gtmVar42.a).a(String.valueOf(String.valueOf(pkaVar3)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                        return;
                    }
                    if (i52 == 3) {
                        int i12 = i2;
                        int i13 = i;
                        gtmVar4.c(pkaVar, i13, i12, 5);
                        dialogInterface.dismiss();
                        return;
                    }
                    if (i52 != 4) {
                        int i14 = i2;
                        int i15 = i;
                        gtmVar4.c(pkaVar, i15, i14, 4);
                        dialogInterface.dismiss();
                        return;
                    }
                    int i16 = i2;
                    int i17 = i;
                    pka pkaVar4 = pkaVar;
                    gtm gtmVar5 = gtmVar4;
                    gtmVar5.d(pkaVar4, i17, i16, 4);
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.c).u()));
                }
            });
            dvVarB = rkcVar3.b();
        }
        final dv dvVar = dvVarB;
        ((out) gtmVar.f).execute(new Runnable() { // from class: goc
            @Override // java.lang.Runnable
            public final void run() {
                gtm gtmVar5 = gtmVar;
                if (((gof) gtmVar5.a).b(dvVar)) {
                    int i11 = iB;
                    int i12 = i2;
                    int i13 = i;
                    ((gtm) gtmVar5.e).b(pkaVar, i13, i12, i11, 2);
                }
            }
        });
    }
}
