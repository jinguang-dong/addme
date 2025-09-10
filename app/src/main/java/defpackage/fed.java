package defpackage;

import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.ar.core.R;
import java.security.SecureRandom;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fed {
    public static final /* synthetic */ int a = 0;
    private static final Uri b = Uri.parse("https://support.google.com/nexus/topic/6012822");
    private static final Uri c = Uri.parse("http://www.google.com/policies/privacy/");
    private static final Uri d = Uri.parse("http://www.google.com/policies/terms/");

    public static final void a(String str, Context context) {
        oet oetVar = new oet(context);
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        new ApplicationErrorReport();
        String str2 = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
        String string = context.getString(R.string.feedback_description_empty);
        final okl oklVar = new okl(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null);
        oklVar.m = null;
        oklVar.f = null;
        oklVar.a = null;
        oklVar.c = string;
        oklVar.b = bundle;
        oklVar.e = String.valueOf(str).concat(".USER_INITIATED_FEEDBACK_REPORT");
        oklVar.h = arrayList;
        oklVar.i = false;
        oklVar.j = null;
        oklVar.k = null;
        oklVar.l = false;
        oklVar.n = str2;
        oklVar.o = false;
        oklVar.p = 0L;
        oklVar.q = false;
        oklVar.r = null;
        oklVar.s = null;
        final long jNanoTime = System.nanoTime();
        ogw ogwVar = new ogw();
        ogwVar.a = new ogt() { // from class: okk
            @Override // defpackage.ogt
            public final void a(Object obj, Object obj2) throws oub {
                Object obj3;
                Boolean bool;
                boolean zBooleanValue;
                oku okuVar = (oku) obj;
                long j = jNanoTime;
                try {
                    ouf oufVar = okw.b;
                    ContentResolver contentResolver = ouf.a;
                    String str3 = ((oud) oufVar).b;
                    Boolean bool2 = (Boolean) ((oud) oufVar).c;
                    boolean zBooleanValue2 = bool2.booleanValue();
                    ouc oucVar = otu.a;
                    ouc.c(contentResolver);
                    synchronized (oucVar) {
                        oucVar.a(contentResolver);
                        obj3 = oucVar.e;
                        bool = (Boolean) ouc.e(oucVar.b, str3, bool2);
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        String strD = oucVar.d(contentResolver, str3);
                        if (strD != null && !strD.isEmpty()) {
                            if (otv.c.matcher(strD).matches()) {
                                zBooleanValue2 = true;
                                bool = true;
                            } else if (otv.d.matcher(strD).matches()) {
                                bool = false;
                                zBooleanValue2 = false;
                            } else {
                                Log.w("Gservices", "attempt to read Gservices key " + str3 + " (value \"" + strD + "\") as boolean");
                            }
                        }
                        synchronized (oucVar) {
                            oucVar.b(obj3, oucVar.b, str3, bool);
                        }
                        zBooleanValue = zBooleanValue2;
                    }
                    Boolean.valueOf(zBooleanValue).getClass();
                    okl oklVar2 = oklVar;
                    if (zBooleanValue) {
                        Parcel parcelObtain = Parcel.obtain();
                        okm.a(oklVar2, parcelObtain, 0);
                        int iDataSize = parcelObtain.dataSize();
                        parcelObtain.recycle();
                        ouf oufVar2 = okw.a;
                        if (iDataSize > ((Integer) oufVar2.a()).intValue()) {
                            throw new IllegalStateException("Max allowed feedback options size of " + oufVar2.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
                        }
                    }
                    ErrorReport errorReport = new ErrorReport(oklVar2, okuVar.t.getCacheDir());
                    okv okvVar = (okv) okuVar.t();
                    Parcel parcelA = okvVar.a();
                    fbj.c(parcelA, errorReport);
                    parcelA.writeLong(j);
                    okvVar.B(6, parcelA);
                    ((pfl) obj2).d(null);
                } catch (RemoteException e) {
                    Log.e("gF_FeedbackClient", "Failed to start feedback", e);
                    ((pfl) obj2).c(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        ogwVar.c = 6005;
        oetVar.i(ogwVar.a());
    }

    public static final void b(Context context, Activity activity) throws PackageManager.NameNotFoundException {
        new qas(activity).c(d("fix_camera_app_1", context));
    }

    public static final void c(Context context, Activity activity) throws PackageManager.NameNotFoundException {
        new qas(activity).c(d("android_default", context));
    }

    private static final Intent d(String str, Context context) {
        GoogleHelp googleHelp = new GoogleHelp(23, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
        googleHelp.q = b;
        googleHelp.a(0, context.getResources().getString(R.string.privacy_policy), new Intent("android.intent.action.VIEW", c));
        googleHelp.a(1, context.getResources().getString(R.string.open_source_licenses), new Intent(context, (Class<?>) LicenseMenuActivity.class));
        googleHelp.a(2, context.getResources().getString(R.string.terms_of_service), new Intent("android.intent.action.VIEW", d));
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra(PJGqOKsIpSdZ.QnXP, googleHelp);
    }
}
