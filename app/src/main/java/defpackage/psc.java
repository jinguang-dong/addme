package defpackage;

import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psc extends AsyncTask {
    final /* synthetic */ psd a;
    private int b;
    private int c;

    public psc(psd psdVar) {
        this.a = psdVar;
    }

    private final int b(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        try {
            if (this.a.d.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled) {
                int iB = 6;
                try {
                    try {
                        cursorQuery = this.a.c.getContentResolver().query(Uri.parse(str), null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.getCount() != 0) {
                                    if (!cursorQuery.moveToFirst()) {
                                        iB = 16;
                                    } else if (cursorQuery.getType(0) != 3) {
                                        iB = 17;
                                    } else {
                                        try {
                                            try {
                                                int i = Integer.parseInt(cursorQuery.getString(0));
                                                if (i > 12 || i < -1) {
                                                    Log.e("LensSdkParamsReader", a.bv(i, "Failed to start Lens: Error "));
                                                    i = 12;
                                                }
                                                iB = prh.b(i);
                                            } catch (NumberFormatException e) {
                                                Log.e("LensSdkParamsReader", "Unable to parse Lens version code value.", e);
                                                iB = 18;
                                            }
                                        } catch (CursorIndexOutOfBoundsException e2) {
                                            Log.e("LensSdkParamsReader", "Out of bounds parsing Lens version code value.", e2);
                                        }
                                    }
                                    cursorQuery.close();
                                    return iB;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery == null) {
                                    throw th;
                                }
                                cursorQuery.close();
                                throw th;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return 6;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorQuery = null;
                    }
                } catch (Exception e3) {
                    Log.e("LensSdkParamsReader", "Failed to start Lens due to unexpected exception.", e3);
                    return 6;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        return 3;
    }

    public final void a(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        int i3 = i2 - 2;
        if (i2 == 0) {
            throw null;
        }
        psd psdVar = this.a;
        psk pskVar = psdVar.f;
        tpc tpcVar = (tpc) pskVar.a(5, null);
        tpcVar.r(pskVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        psk pskVar2 = (psk) tpcVar.b;
        psk pskVar3 = psk.a;
        pskVar2.e = i - 2;
        pskVar2.b |= 4;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        psk pskVar4 = (psk) tpcVar.b;
        pskVar4.f = i3;
        pskVar4.b |= 8;
        psdVar.f = (psk) tpcVar.l();
        psdVar.g = true;
        List list = psdVar.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((psb) it.next()).a(psdVar.f);
        }
        list.clear();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b = b(psd.a);
        this.c = b(psd.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        a(this.b, this.c);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        new Handler(this.a.c.getMainLooper()).postDelayed(new oze(this, 5, null), 4000L);
    }
}
