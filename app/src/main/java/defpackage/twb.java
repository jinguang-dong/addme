package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twb {
    public static final String a = "twb";

    private twb() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.app.Activity r7, boolean r8) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.lang.String r1 = "android.software.vr.mode"
            boolean r0 = r0.hasSystemFeature(r1)
            r1 = 0
            if (r0 == 0) goto Lcd
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r2 = "com.google.vr.vrcore"
            java.lang.String r3 = "com.google.vr.vrcore.common.VrCoreListenerService"
            r0.<init>(r2, r3)
            r7.setVrModeEnabled(r8, r0)     // Catch: java.lang.UnsupportedOperationException -> L1b android.content.pm.PackageManager.NameNotFoundException -> L2d
            r7 = 1
            return r7
        L1b:
            r7 = move-exception
            java.lang.String r8 = defpackage.twb.a
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "Failed to set VR mode: "
            java.lang.String r7 = r0.concat(r7)
            android.util.Log.w(r8, r7)
            goto Lcd
        L2d:
            r8 = move-exception
            java.lang.String r0 = defpackage.twb.a
            java.lang.String r8 = r8.toString()
            java.lang.String r4 = "No VR service component: "
            java.lang.String r8 = r4.concat(r8)
            android.util.Log.w(r0, r8)
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            java.lang.String r4 = "android.hardware.vr.high_performance"
            boolean r8 = r8.hasSystemFeature(r4)
            if (r8 == 0) goto Lcd
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            java.util.List r8 = r8.getInstalledApplications(r1)
            java.util.Iterator r8 = r8.iterator()
        L55:
            boolean r4 = r8.hasNext()
            r5 = -1
            r6 = -2
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r8.next()
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4
            java.lang.String r4 = r4.packageName
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L55
            android.content.ContentResolver r8 = r7.getContentResolver()
            java.lang.String r4 = "enabled_vr_listeners"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            r4.<init>(r2, r3)
            if (r8 == 0) goto L89
            java.lang.String r2 = r4.flattenToString()
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L87
            goto L89
        L87:
            r8 = r1
            goto L8c
        L89:
            r8 = r6
            goto L8c
        L8b:
            r8 = r5
        L8c:
            java.lang.String r2 = "goldfish"
            java.lang.String r3 = android.os.Build.HARDWARE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc8
            java.lang.String r2 = "ranchu"
            java.lang.String r3 = android.os.Build.HARDWARE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La1
            goto Lc8
        La1:
            r2 = 0
            if (r8 != r5) goto Lb5
            fdf r8 = new fdf
            r0 = 15
            r8.<init>(r7, r0, r2)
            r0 = 2132017572(0x7f1401a4, float:1.9673426E38)
            r2 = 2132017762(0x7f140262, float:1.9673812E38)
            b(r7, r0, r2, r8)
            goto Lcd
        Lb5:
            if (r8 != r6) goto Lc8
            fdf r8 = new fdf
            r0 = 16
            r8.<init>(r7, r0, r2)
            r0 = 2132017571(0x7f1401a3, float:1.9673424E38)
            r2 = 2132017763(0x7f140263, float:1.9673814E38)
            b(r7, r0, r2, r8)
            goto Lcd
        Lc8:
            java.lang.String r7 = "Failed to handle missing VrCore package."
            android.util.Log.w(r0, r7)
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twb.a(android.app.Activity, boolean):boolean");
    }

    private static void b(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.GvrDialogTheme);
        builder.setMessage(i).setTitle(R.string.dialog_title_warning).setPositiveButton(i2, onClickListener).setNegativeButton(R.string.cancel_button, new jdc(6));
        builder.create().show();
    }
}
