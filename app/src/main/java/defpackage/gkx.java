package defpackage;

import android.media.MediaPlayer;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gkx implements mon {
    final /* synthetic */ moo a;
    final /* synthetic */ gky b;

    public gkx(gky gkyVar, moo mooVar) {
        this.a = mooVar;
        this.b = gkyVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, moo] */
    @Override // defpackage.mon
    public final void a() {
        gky gkyVar = this.b;
        if (gkyVar.h() == 1) {
            EduImageView.d(gkyVar.a);
            return;
        }
        this.a.a();
        gkyVar.b();
        if (gkyVar.i.h()) {
            rwc rwcVar = gkyVar.c;
            if (rwcVar.h()) {
                rwcVar.c().a();
                ((gky) gkyVar.i.c()).b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, moo] */
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.a.m(0);
        gky gkyVar = this.b;
        rwc rwcVar = gkyVar.c;
        if (rwcVar.h()) {
            rwcVar.c().m(0);
        }
        gkyVar.f();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.b.g.run();
    }

    @Override // defpackage.mon
    public final void b() {
    }

    @Override // defpackage.mon
    public final void c() {
    }
}
