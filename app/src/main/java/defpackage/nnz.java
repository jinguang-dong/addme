package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnz extends bm {
    public nox a;
    private nov b;

    @Override // defpackage.bm
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.videoplayer_fragment, viewGroup, false);
        this.b = new nom();
        nod nodVar = new nod(new lck(this, 2));
        noi noiVar = new noi();
        boolean z = this.l.getBoolean("auto_loop_enabled", false);
        nox noxVar = new nox(this.b, nodVar, noiVar, viewInflate, this.l.getBoolean("no_seek_bar", false));
        this.a = noxVar;
        View view = noxVar.d;
        noxVar.f = (VideoView) view.findViewById(R.id.video_view);
        noxVar.f.setOnTouchListener(new fuo(noxVar, 13, null));
        view.setOnClickListener(new mlk(noxVar, 18));
        noxVar.f.setWillNotDraw(false);
        noxVar.h = (ImageButton) view.findViewById(R.id.videoplayer_pause_button);
        noxVar.h.setOnClickListener(new mlk(noxVar, 16));
        noxVar.g = (ImageButton) view.findViewById(R.id.videoplayer_play_button);
        noxVar.g.setOnClickListener(new mlk(noxVar, 17));
        noxVar.l = view.findViewById(R.id.video_progress_group);
        noxVar.k = (SeekBar) view.findViewById(R.id.video_player_progress);
        noxVar.k.setOnSeekBarChangeListener(new now(noxVar, 0));
        noxVar.i = (TextView) view.findViewById(R.id.video_total_time);
        noxVar.j = (TextView) view.findViewById(R.id.video_current_time);
        noxVar.o = view.findViewById(R.id.video_view_holder);
        Rect rect = (Rect) this.l.getParcelable("video_view_padding");
        if (rect != null) {
            this.a.o.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        Uri uri = (Uri) this.l.getParcelable("video_uri");
        uri.getClass();
        nox noxVar2 = this.a;
        noiVar.e(noxVar2, new nyr(noxVar2));
        noiVar.a();
        noiVar.b();
        this.b.k(this.a, uri, nodVar, noiVar, bundle != null ? bundle.getInt("videoplayer_position", 0) : 0, bundle != null ? bundle.getBoolean("videoplayer_playing_state", true) : true, z);
        this.b.a();
        nodVar.a();
        return viewInflate;
    }

    @Override // defpackage.bm
    public final void onPause() {
        super.onPause();
        this.b.d();
    }

    @Override // defpackage.bm
    public final void onResume() {
        super.onResume();
        this.b.j();
    }

    @Override // defpackage.bm
    public final void onSaveInstanceState(Bundle bundle) {
        boolean zIsPlaying = this.a.f.isPlaying();
        int currentPosition = this.a.f.getCurrentPosition();
        bundle.putBoolean("videoplayer_playing_state", zIsPlaying);
        bundle.putInt("videoplayer_position", currentPosition);
    }
}
