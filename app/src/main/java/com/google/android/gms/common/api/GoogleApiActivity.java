package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import defpackage.a;
import defpackage.odj;
import defpackage.odn;
import defpackage.ogd;
import defpackage.ojl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                ogd ogdVarC = ogd.c(this);
                if (i2 == -1) {
                    ogdVarC.e();
                } else if (i2 == 0) {
                    ogdVarC.d(new odj(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }

    private final void b() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e) {
                e = e;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                googleApiActivity = this;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
                return;
            } catch (ActivityNotFoundException e3) {
                e = e3;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    ogd.c(googleApiActivity).d(new odj(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strBx = a.bx(pendingIntent, JvFFEwFNdCrxf.kaFHPxnJPETRBSs, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strBx = strBx.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strBx, activityNotFoundException);
                }
                googleApiActivity.a = 1;
                googleApiActivity.finish();
                return;
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
                return;
            }
        }
        ojl.ay(num);
        odn.a.c(this, num.intValue(), 2, this);
        this.a = 1;
    }
}
