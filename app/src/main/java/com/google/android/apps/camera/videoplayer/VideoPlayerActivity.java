package com.google.android.apps.camera.videoplayer;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.google.ar.core.R;
import defpackage.ai;
import defpackage.dx;
import defpackage.nny;
import defpackage.nnz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoPlayerActivity extends dx {
    private final BroadcastReceiver o = new nny(this);

    private final nnz q() {
        return (nnz) eo().d(R.id.video_player_activity_layout);
    }

    private final void r(Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("no_seek_bar", false);
        bundle.putBoolean("auto_loop_enabled", false);
        bundle.putParcelable("video_uri", uri);
        nnz nnzVar = new nnz();
        nnzVar.setArguments(bundle);
        ai aiVar = new ai(eo());
        aiVar.m(R.id.video_player_activity_layout, nnzVar);
        aiVar.h();
    }

    @Override // defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.videoplayer_activity_main);
        if (q() == null) {
            Uri data = getIntent().getData();
            data.getClass();
            r(data);
        }
        registerReceiver(this.o, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // defpackage.dx, defpackage.bp, android.app.Activity
    protected final void onDestroy() {
        unregisterReceiver(this.o);
        super.onDestroy();
    }

    @Override // defpackage.nh, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        nnz nnzVarQ = q();
        if (nnzVarQ != null) {
            ai aiVar = new ai(eo());
            aiVar.k(nnzVarQ);
            aiVar.h();
        }
        Uri data = intent.getData();
        data.getClass();
        r(data);
    }
}
