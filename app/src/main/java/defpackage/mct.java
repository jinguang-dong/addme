package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mct implements mon {
    public final Context a;
    public final moj b;
    public final Uri c;
    public final ScheduledExecutorService d;
    public ScheduledFuture e;
    public boolean f = true;
    public final mwq g;
    private final String h;
    private final mck i;
    private final Executor j;

    public mct(moj mojVar, Uri uri, String str, Context context, mwq mwqVar, mck mckVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.h = str;
        this.a = context;
        this.g = mwqVar;
        this.b = mojVar;
        this.c = uri;
        this.i = mckVar;
        this.j = executor;
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.mon
    public final void a() {
        Context context = this.a;
        if (jsv.E(context) == 1) {
            EduImageView.d(context);
            return;
        }
        this.g.k(this.c);
        this.b.j();
        e();
    }

    @Override // defpackage.mon
    public final void b() {
        moj mojVar = this.b;
        if (mojVar.q()) {
            mojVar.l();
            mojVar.i();
            mojVar.k().setOnClickListener(null);
            mojVar.k().setClickable(false);
        }
    }

    @Override // defpackage.mon
    public final void c() {
        moj mojVar = this.b;
        mojVar.a();
        mck mckVar = this.i;
        if (equals(mckVar.d)) {
            mckVar.c.b();
        } else if (equals(mckVar.c)) {
            mckVar.d.b();
        }
        if (this.f) {
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setAcceptsDelayedFocusGain(false).setOnAudioFocusChangeListener(new mcs(this)).build();
            if (audioManager != null) {
                audioManager.requestAudioFocus(audioFocusRequestBuild);
            }
            this.f = false;
        }
        mojVar.k().setOnClickListener(new kcm(this, 18));
        mojVar.k().setClickable(true);
        mojVar.o();
    }

    public final void d() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            return;
        }
        this.e.cancel(false);
    }

    public final void e() {
        ojl.ck(this.g.j(this.c), new fqz(this, 20), this.j);
    }

    public final void f() {
        this.b.p();
        d();
    }

    public final void g(String str) {
        moj mojVar = this.b;
        mojVar.n(str);
        mojVar.k().setContentDescription(this.h);
        mojVar.k().setClickable(false);
    }

    public final void h() {
        this.b.c = this;
        ojl.ck(this.g.j(this.c), new fqz(this, 19), this.j);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.b.i();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        moj mojVar = this.b;
        mojVar.m(41);
        mojVar.i();
    }
}
