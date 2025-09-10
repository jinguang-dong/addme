package com.google.android.apps.camera.ui.compositevideoview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.ar.core.R;
import defpackage.fuo;
import defpackage.mlk;
import defpackage.moj;
import defpackage.mok;
import defpackage.mol;
import defpackage.mom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CompositeVideoView extends moj {
    public VideoView d;

    public CompositeVideoView(Context context) {
        super(context);
    }

    @Override // defpackage.moo
    public final View k() {
        return this.d;
    }

    @Override // defpackage.moo
    public final void l() {
        this.d.pause();
    }

    @Override // defpackage.moo
    public final void m(int i) {
        this.d.seekTo(i);
        this.d.setBackground(null);
    }

    @Override // defpackage.moo
    public final void n(String str) {
        this.d.setVideoURI(Uri.parse(str));
    }

    @Override // defpackage.moo
    public final void o() {
        this.d.start();
        this.d.setBackground(null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        c();
        LayoutInflater.from(getContext()).inflate(R.layout.cvv_root, this);
        this.d = (VideoView) findViewById(R.id.cvv_videoview);
        this.a = (ImageView) findViewById(R.id.cvv_control);
        this.b = (CircularProgressIndicator) findViewById(R.id.cvv_progressbar);
        int i = 0;
        this.d.setAudioFocusRequest(0);
        this.d.setOnTouchListener(new fuo(new GestureDetector(getContext(), new mom(this)), 10, null));
        this.d.setOnClickListener(new mlk(this, 6));
        this.d.setOnCompletionListener(new mok(this, i));
        this.d.setOnPreparedListener(new mol(this, i));
        h();
    }

    @Override // defpackage.moo
    public final void p() {
        this.d.stopPlayback();
    }

    @Override // defpackage.moo
    public final boolean q() {
        return this.d.isPlaying();
    }

    public CompositeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompositeVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
