package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psd {
    public static final String a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final String b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    private static final psk h;
    public final Context c;
    public final PackageManager d;
    public final List e;
    public psk f;
    public boolean g;

    static {
        tpc tpcVarM = psk.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        psk pskVar = (psk) tphVar;
        pskVar.b |= 1;
        pskVar.c = "1.2.1";
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        psk pskVar2 = (psk) tphVar2;
        pskVar2.b |= 2;
        pskVar2.d = "";
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        psk pskVar3 = (psk) tphVar3;
        pskVar3.e = -1;
        pskVar3.b |= 4;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        psk pskVar4 = (psk) tpcVarM.b;
        pskVar4.f = -1;
        pskVar4.b |= 8;
        h = (psk) tpcVarM.l();
    }

    public final void a(psb psbVar) {
        if (this.g) {
            psbVar.a(this.f);
        } else {
            this.e.add(psbVar);
        }
    }

    public psd(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        this.e = new ArrayList();
        this.c = context;
        this.d = packageManager;
        this.g = false;
        psk pskVar = h;
        this.f = pskVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(LmJPKwPBa.GwbcGJIqzkFDsgQ, 0);
            if (packageInfo != null) {
                tpc tpcVar = (tpc) pskVar.a(5, null);
                tpcVar.r(pskVar);
                String str = packageInfo.versionName;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                psk pskVar2 = (psk) tpcVar.b;
                psk pskVar3 = psk.a;
                str.getClass();
                pskVar2.b |= 2;
                pskVar2.d = str;
                this.f = (psk) tpcVar.l();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new psc(this).execute(new Void[0]);
    }
}
