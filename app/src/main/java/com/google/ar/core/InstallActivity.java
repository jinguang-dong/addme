package com.google.ar.core;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import defpackage.qej;
import defpackage.rtj;
import defpackage.rtn;
import defpackage.rto;
import defpackage.rtp;
import defpackage.rtq;
import defpackage.rtr;
import defpackage.rts;
import defpackage.rtt;
import defpackage.rtv;
import defpackage.rtw;
import defpackage.rty;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InstallActivity extends Activity {
    private static final int BOX_SIZE_DP = 280;
    private static final int INSTALLING_TEXT_BOTTOM_MARGIN_DP = 30;
    static final String INSTALL_BEHAVIOR_KEY = "behavior";
    static final String MESSAGE_TYPE_KEY = "message";
    private static final String TAG = "ARCore-InstallActivity";
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    private ArCoreApk.UserMessageType messageType;
    private boolean waitingForCompletion;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, android.R.style.Theme.Material.Light.Dialog.Alert);
    private rts lastEvent = rts.CANCELLED;

    /* JADX INFO: Access modifiers changed from: private */
    public void animateToSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density * 280.0f;
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        int i = (int) f;
        getWindow().getDecorView().setMinimumWidth(i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new rtp(this, width, i, height));
        valueAnimatorOfFloat.addListener(new rtq(this));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInstaller() {
        startActivity(new Intent(this, (Class<?>) InstallActivity.class).setFlags(67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithFailure(Exception exc) {
        rtj rtjVar = rtj.a;
        rtjVar.c = exc;
        rtjVar.c();
        this.finished = true;
        super.finish();
    }

    private boolean isOptional() {
        return this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL;
    }

    private void showEducationDialog() {
        setContentView(R.layout.__arcore_education);
        findViewById(R.id.__arcore_cancelButton).setOnClickListener(new rto(this, 1));
        if (!isOptional()) {
            findViewById(R.id.__arcore_cancelButton).setVisibility(8);
        }
        findViewById(R.id.__arcore_continueButton).setOnClickListener(new rto(this, 0));
        TextView textView = (TextView) findViewById(R.id.__arcore_messageText);
        ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        if (this.messageType.ordinal() != 1) {
            textView.setText(R.string.__arcore_install_app);
        } else {
            textView.setText(R.string.__arcore_install_feature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(R.string.__arcore_installing);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInstaller() {
        this.installStarted = true;
        this.lastEvent = rts.CANCELLED;
        rtt rttVarA = rtj.a.a(this);
        rtr rtrVar = new rtr(this);
        if (rttVarA.d == null) {
            try {
                rttVarA.c = getPackageManager().getPackageInstaller();
                rttVarA.d = new rtv(rttVarA, rtrVar);
                rttVarA.c.registerSessionCallback(rttVarA.d);
            } catch (NullPointerException unused) {
                rtrVar.b(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (rttVarA.a == null) {
            rttVarA.a = new rtw(rtrVar);
            rttVarA.b = this;
            rttVarA.b.registerReceiver(rttVarA.a, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
        }
        try {
            rttVarA.e(new qej(rttVarA, (Context) this, (Object) rtrVar, 5));
        } catch (rty unused2) {
            Log.w("ARCore-InstallService", "requestInstall bind failed, launching fullscreen.");
            rtt.g(this, rtrVar);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.finished) {
            rtj.a.c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                startInstaller();
            }
        } else {
            if (this.finished) {
                return;
            }
            synchronized (this) {
                rts rtsVar = this.lastEvent;
                if (rtsVar == rts.CANCELLED) {
                    finish();
                } else if (rtsVar == rts.ACCEPTED) {
                    this.waitingForCompletion = true;
                } else {
                    finishWithFailure(rtj.a.c);
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                finishWithFailure(new FatalException(PJGqOKsIpSdZ.AHPI));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra(MESSAGE_TYPE_KEY);
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra(INSTALL_BEHAVIOR_KEY);
            this.installBehavior = installBehavior;
            if (this.messageType != null && installBehavior != null) {
                setTheme(android.R.style.Theme.Material.Light.Dialog.Alert);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(isOptional());
                if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                    showSpinner();
                    return;
                }
                AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
                rtj.a.a(this).b(this, new rtn(atomicReference));
                int iOrdinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 3) {
                        finishWithFailure(new UnavailableDeviceNotCompatibleException());
                        return;
                    }
                } else {
                    Log.w(TAG, "Preliminary compatibility check failed.");
                }
                showEducationDialog();
                return;
            }
            Log.e(TAG, "missing intent data.");
            finishWithFailure(new FatalException("Install activity launched without config data."));
        } catch (RuntimeException e) {
            finishWithFailure(new FatalException("Exception starting install flow", e));
        }
    }
}
