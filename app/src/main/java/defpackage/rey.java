package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rey extends BroadcastReceiver {
    public static final String a = "rey";
    public final rfc b;

    public rey(rfc rfcVar) {
        this.b = rfcVar;
    }

    public static final void a(BroadcastReceiver.PendingResult pendingResult) {
        pendingResult.abortBroadcast();
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Display display;
        context.getClass();
        intent.getClass();
        try {
            View viewA = rfn.a();
            viewA.getClass();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -863632221) {
                    if (iHashCode != -95493807) {
                        if (iHashCode == 210860679 && action.equals("com.google.android.libraries.snapshot.action.CAPTURE_SNAPSHOT")) {
                            Bundle extras = intent.getExtras();
                            String string = extras != null ? extras.getString("snapshotter_id") : null;
                            if (string == null || ((display = viewA.getDisplay()) != null && a.ao(qsz.d(context, display.getDisplayId()), string))) {
                                ukc.C(ung.j(rfc.a), null, 0, new rex(this, viewA, goAsync(), System.nanoTime(), null), 3);
                                return;
                            }
                            return;
                        }
                    } else if (action.equals("com.google.android.libraries.snapshot.action.RESET_COUNTERS")) {
                        for (rnu rnuVar : this.b.c) {
                        }
                        return;
                    }
                } else if (action.equals("com.google.android.libraries.snapshot.action.GET_SNAPSHOTTER_INFO")) {
                    try {
                        Display display2 = viewA.getDisplay();
                        if (display2 == null) {
                            return;
                        }
                        int displayId = display2.getDisplayId();
                        String strJoin = TextUtils.join(",", new Object[]{qsz.d(context, displayId), context.getPackageName(), context.getClass().getSimpleName(), Integer.valueOf(displayId), Integer.valueOf(Process.myPid())});
                        String resultData = getResultData();
                        setResultData((resultData == null ? "" : resultData + "\n") + strJoin);
                        setResultCode(-1);
                        return;
                    } catch (RuntimeException e) {
                        Log.e(a, "Failed to get snapshotter info", e);
                        return;
                    }
                }
            }
            Log.e(a, "Receiver does not know how to handle action: ".concat(String.valueOf(intent.getAction())));
        } catch (rfi unused) {
            Log.e(a, "Failed to snapshot hierarchy. Could not find any window to capture.");
        }
    }
}
