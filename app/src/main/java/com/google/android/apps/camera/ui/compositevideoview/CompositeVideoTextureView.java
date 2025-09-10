package com.google.android.apps.camera.ui.compositevideoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.ar.core.R;
import defpackage.moj;
import defpackage.mok;
import defpackage.mol;
import defpackage.sgt;
import defpackage.sgv;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CompositeVideoTextureView extends moj implements TextureView.SurfaceTextureListener {
    private static final sgv d = sgv.g("com.google.android.apps.camera.ui.compositevideoview.CompositeVideoTextureView");
    private TextureView e;
    private MediaPlayer f;
    private Surface g;
    private String h;
    private boolean i;

    public CompositeVideoTextureView(Context context) {
        super(context);
        this.i = false;
    }

    private final void r() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Surface surface = this.g;
        surface.getClass();
        mediaPlayer.setSurface(surface);
        try {
            String str = this.h;
            str.getClass();
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepareAsync();
        } catch (IOException | IllegalStateException e) {
            ((sgt) ((sgt) d.b().i(e)).M(4978)).v("Exception when attempting to set mediaPlayer uri to String: %s", this.h);
        }
        int i = 1;
        mediaPlayer.setOnCompletionListener(new mok(this, i));
        mediaPlayer.setOnPreparedListener(new mol(this, i));
        this.f = mediaPlayer;
    }

    private final boolean s() {
        return (this.h == null || this.g == null || !this.i) ? false : true;
    }

    @Override // defpackage.moo
    public final View k() {
        return this.e;
    }

    @Override // defpackage.moo
    public final void l() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // defpackage.moo
    public final void m(int i) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    @Override // defpackage.moo
    public final void n(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (this.h == null) {
            this.h = str;
            if (s()) {
                r();
            }
        }
    }

    @Override // defpackage.moo
    public final void o() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        c();
        LayoutInflater.from(getContext()).inflate(R.layout.ctv_root, this);
        TextureView textureView = (TextureView) findViewById(R.id.ctv_texture_view);
        this.e = textureView;
        textureView.setSurfaceTextureListener(this);
        Matrix matrix = new Matrix();
        matrix.setScale(1.005f, 1.005f);
        this.e.setTransform(matrix);
        this.a = (ImageView) findViewById(R.id.ctv_control_symbol);
        this.b = (CircularProgressIndicator) findViewById(R.id.ctv_progressbar);
        h();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.i = true;
        this.g = new Surface(surfaceTexture);
        if (s()) {
            r();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f.release();
            this.f = null;
        }
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.i = false;
        return true;
    }

    @Override // defpackage.moo
    public final void p() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override // defpackage.moo
    public final boolean q() {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    public CompositeVideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
    }

    public CompositeVideoTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
