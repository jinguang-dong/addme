package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twe implements tws {
    private static final String a = "twe";
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;

    public twe(ContentProviderClient contentProviderClient, String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        }
        this.b = contentProviderClient;
        this.c = thu.j(str, "device_params");
        this.d = thu.j(str, "user_prefs");
        this.e = thu.j(str, "phone_params");
        this.f = thu.j(str, "sdk_configuration_params");
        thu.j(str, "recent_headsets");
    }

    private final tqr g(tqq tqqVar, Uri uri, String str) throws Throwable {
        byte[] bArrH = h(uri, str);
        if (bArrH == null) {
            return null;
        }
        try {
            return tqqVar.d(bArrH).l();
        } catch (tpz e) {
            Log.e(a, "Error reading params from ContentProvider", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final byte[] h(android.net.Uri r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            r8 = this;
            r1 = 0
            android.content.ContentProviderClient r2 = r8.b     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L36
            r6 = 0
            r7 = 0
            r4 = 0
            r3 = r9
            r5 = r10
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L36
            if (r8 == 0) goto L23
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L47
            if (r9 == 0) goto L23
            r9 = 0
            byte[] r9 = r8.getBlob(r9)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L47
            if (r9 != 0) goto L1f
            r8.close()
            return r1
        L1f:
            r8.close()
            return r9
        L23:
            java.lang.String r9 = defpackage.twe.a     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L2f java.lang.Throwable -> L2f java.lang.Throwable -> L47
            java.lang.String r10 = "Invalid params result from ContentProvider query: "
            java.lang.String r10 = defpackage.eld.b(r3, r10)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L2f java.lang.Throwable -> L2f java.lang.Throwable -> L47
            android.util.Log.e(r9, r10)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L2f java.lang.Throwable -> L2f java.lang.Throwable -> L47
            goto L41
        L2f:
            r0 = move-exception
            r9 = r0
            goto L3a
        L32:
            r0 = move-exception
            r8 = r0
            r9 = r8
            goto L4a
        L36:
            r0 = move-exception
            r8 = r0
            r9 = r8
            r8 = r1
        L3a:
            java.lang.String r10 = defpackage.twe.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "Error reading params from ContentProvider"
            android.util.Log.e(r10, r0, r9)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r8 == 0) goto L46
            r8.close()
        L46:
            return r1
        L47:
            r0 = move-exception
            r9 = r0
            r1 = r8
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twe.h(android.net.Uri, java.lang.String):byte[]");
    }

    @Override // defpackage.tws
    public final snh a(txs txsVar) {
        String strEncodeToString = Base64.encodeToString(txsVar.h(), 0);
        snh snhVar = txg.c;
        tpc tpcVar = (tpc) snhVar.a(5, null);
        tpcVar.r(snhVar);
        return (snh) g(tpcVar, this.f, strEncodeToString);
    }

    @Override // defpackage.tws
    public final txp b() {
        return (txp) g(txp.a.m(), this.c, null);
    }

    @Override // defpackage.tws
    public final txq c() {
        return (txq) g(txq.a.m(), this.e, null);
    }

    @Override // defpackage.tws
    public final txr d() {
        return (txr) g(txr.a.m(), this.d, null);
    }

    @Override // defpackage.tws
    public final void e() throws Exception {
        this.b.close();
    }

    @Override // defpackage.tws
    public final boolean f(txp txpVar) throws RemoteException {
        int iUpdate;
        Uri uri = this.c;
        try {
            if (txpVar == null) {
                iUpdate = this.b.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", txpVar.h());
                iUpdate = this.b.update(uri, contentValues, null, null);
            }
            return iUpdate > 0;
        } catch (RemoteException e) {
            Log.e(a, "Failed to write params to ContentProvider", e);
            return false;
        } catch (SecurityException e2) {
            Log.e(a, "Insufficient permissions to write params to ContentProvider", e2);
            return false;
        }
    }
}
