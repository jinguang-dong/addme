package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.preference.ListPreference;
import android.util.Log;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fdf implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fdf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fqy fqyVar;
        switch (this.b) {
            case 0:
                dialogInterface.dismiss();
                ((fdg) this.a).a.a("Camera Disabled due to policy");
                break;
            case 1:
                Object obj = this.a;
                ((dag) obj).ag = i;
                ((dap) obj).ak = -1;
                dialogInterface.dismiss();
                break;
            case 2:
                ((feb) ((tdy) this.a).b).a("ImageIntent: No write permission to intent media output uri.");
                break;
            case 3:
                fqy fqyVar2 = ((gbb) this.a).e;
                if (fqyVar2 != null) {
                    fqyVar2.m(true);
                }
                dialogInterface.dismiss();
                break;
            case 4:
                gbb gbbVar = (gbb) this.a;
                fqy fqyVar3 = gbbVar.e;
                if (fqyVar3 != null) {
                    fqyVar3.m(true);
                }
                fyw fywVar = gbbVar.a;
                if (fywVar.p()) {
                    gbbVar.b.B(nkw.PHOTO);
                }
                if (fywVar.f() && (fqyVar = gbbVar.e) != null) {
                    fqyVar.d();
                }
                dialogInterface.dismiss();
                break;
            case 5:
                ((Context) ((cxb) this.a).a).startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:com.google.android.apps.photos")));
                break;
            case 6:
                ((Context) ((cxb) this.a).a).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.photos")).setPackage("com.android.vending").addCategory("android.intent.category.BROWSABLE"));
                break;
            case 7:
                ListPreference listPreference = (ListPreference) this.a;
                listPreference.setValueIndex(i);
                listPreference.setSummary(listPreference.getEntries()[i]);
                dialogInterface.dismiss();
                break;
            case 8:
                jxa jxaVar = (jxa) ((juc) this.a).a;
                jeg jegVar = jxaVar.s;
                if (jegVar != null && !jegVar.r) {
                    jxaVar.c();
                    break;
                } else {
                    ((sgt) jxa.a.c().M(3094)).s("Photo is being taken, ignoring user's request for cancel.");
                    break;
                }
            case 9:
                ((jxa) ((juc) this.a).a).e();
                break;
            case 10:
                ((jxa) this.a).S.K.d();
                break;
            case 11:
                ((jxa) this.a).S.i("Fatal error in Panorama module: 2132018539");
                break;
            case 12:
                ((Context) ((ocq) this.a).a).startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
                break;
            case 13:
                mgh mghVar = (mgh) this.a;
                rwc rwcVar = mghVar.b;
                Context context = mghVar.a;
                Intent intentW = jea.w(context);
                if (!rwcVar.h()) {
                    context.startActivity(intentW);
                    break;
                } else {
                    ((lqc) rwcVar.c()).c(intentW);
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                dialogInterface.dismiss();
                mlg mlgVar = (mlg) this.a;
                mlgVar.b.a(true);
                mlgVar.f.l(mlgVar.d);
                break;
            case 15:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
                intent.setPackage("com.android.vending");
                try {
                    ((Context) this.a).startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    Log.e(twb.a, "Google Play Services is not installed, unable to download VrCore.");
                    return;
                }
            default:
                ((Context) this.a).startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
                break;
        }
    }

    public fdf(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
