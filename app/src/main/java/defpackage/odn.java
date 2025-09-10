package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odn extends odo {
    private static final Object e = new Object();
    public static final odn a = new odn();
    public static final int b = odo.c;

    public final void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof bp) {
                ch chVarEo = ((bp) activity).eo();
                oeh oehVar = new oeh();
                ojl.az(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                oehVar.ag = dialog;
                if (onCancelListener != null) {
                    oehVar.ah = onCancelListener;
                }
                oehVar.c(chVarEo, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        odk odkVar = new odk();
        ojl.az(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        odkVar.a = dialog;
        if (onCancelListener != null) {
            odkVar.b = onCancelListener;
        }
        odkVar.show(fragmentManager, str);
    }

    public final Dialog b(Context context, int i, ohv ohvVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ohq.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.ar.core.R.string.common_google_play_services_enable_button) : resources.getString(com.google.ar.core.R.string.common_google_play_services_update_button) : resources.getString(com.google.ar.core.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, ohvVar);
        }
        String strC = ohq.c(context, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void c(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogB = b(activity, i, new oht(g(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogB == null) {
            return;
        }
        a(activity, dialogB, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void d(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        String strC;
        int i3;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new odm(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            strC = ohq.e(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            strC = ohq.c(context, i);
        }
        if (strC == null) {
            strC = context.getResources().getString(com.google.ar.core.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i2 == 6 || i2 == 19) ? ohq.d(context, "common_google_play_services_resolution_required_text", ohq.a(context)) : ohq.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ojl.ay(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        clm clmVar = new clm(context, null);
        clmVar.m = true;
        clmVar.d(16, true);
        clmVar.f(strC);
        cll cllVar = new cll();
        cllVar.a = clm.c(strD);
        clmVar.j(cllVar);
        boolean zC = oji.c(context);
        int i4 = R.drawable.stat_sys_warning;
        if (zC) {
            ojl.au(true);
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            clmVar.i(i4);
            clmVar.h = 2;
            if (oji.e(context)) {
                clmVar.b.add(new clk(IconCompat.b(com.google.ar.core.R.drawable.common_full_open_on_phone), resources.getString(com.google.ar.core.R.string.common_open_on_phone), pendingIntent, new Bundle(), null));
            } else {
                clmVar.g = pendingIntent;
            }
        } else {
            clmVar.i(R.drawable.stat_sys_warning);
            String string = resources.getString(com.google.ar.core.R.string.common_google_play_services_notification_ticker);
            Notification notification = clmVar.q;
            notification.tickerText = clm.c(string);
            notification.when = System.currentTimeMillis();
            clmVar.g = pendingIntent;
            clmVar.e(strD);
        }
        ojl.au(true);
        synchronized (e) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string2 = context.getResources().getString(com.google.ar.core.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        clmVar.p = "com.google.android.gms.availability";
        Notification notificationA = clmVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            oef.b.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }
}
