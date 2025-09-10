package defpackage;

import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.wear.ambient.AmbientMode;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvb implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public lvb(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                mky mkyVar = ((hbj) this.a.a()).p(haw.j) ? mky.AUTO_FPS_30_5X : mky.MANUAL_FPS_30_1X;
                mkyVar.getClass();
                return mkyVar;
            case 1:
                return ((luo) this.a).a().n("pref_switch_camera_command_string", 47);
            case 2:
                return new luv(((luo) this.a).a().o("pref_video_fps_4k_key", ltt.FPS_30.name()));
            case 3:
                return new luv(((luo) this.a).a().o("pref_video_fps_cm_key", ltt.FPS_30.name()));
            case 4:
                return new luv(((luo) this.a).a().o("pref_video_fps_vb_key", ltt.FPS_30.name()));
            case 5:
                return ((luo) this.a).a().n("pref_zoom_in_command_string", 19);
            case 6:
                return ((luo) this.a).a().n("pref_zoom_out_command_string", 20);
            case 7:
                return ((luo) this.a).a().m("pref_audio_zoom_key", true);
            case 8:
                return ((luo) this.a).a().m("pref_has_checked_cheetah_mode", false);
            case 9:
                return new lwq(((imm) this.a).b());
            case 10:
                return new nmt((lww) this.a.a());
            case 11:
                return new lww((hbj) this.a.a());
            case 12:
                return new AmbientMode.AmbientController((syu) this.a.a(), null);
            case 13:
                return !((Boolean) this.a.a()).booleanValue() ? rvk.a : rwc.j(new lzq());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.v));
            case 15:
                return new obu(((nna) this.a).a());
            case 16:
                luj lujVar = (luj) this.a.a();
                owf owfVarG = owl.g(lujVar.a(luf.k), lujVar.a(luf.t));
                owfVarG.getClass();
                return owfVarG;
            case 17:
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                gzi gziVar = gzo.a;
                SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(builder.setUsage(11).setContentType(4).setHapticChannelsMuted(false).build()).setMaxStreams(3).build();
                soundPoolBuild.getClass();
                return soundPoolBuild;
            case 18:
                SoundPool.Builder builder2 = new SoundPool.Builder();
                AudioAttributes.Builder builder3 = new AudioAttributes.Builder();
                gzi gziVar2 = gzo.a;
                SoundPool soundPoolBuild2 = builder2.setAudioAttributes(builder3.setUsage(13).setContentType(4).setFlags(1).build()).setMaxStreams(3).build();
                soundPoolBuild2.getClass();
                return soundPoolBuild2;
            case 19:
                AudioAttributes.Builder builder4 = new AudioAttributes.Builder();
                gzi gziVar3 = gzo.a;
                SoundPool soundPoolBuild3 = new SoundPool.Builder().setAudioAttributes(builder4.setUsage(13).setContentType(4).setHapticChannelsMuted(false).build()).setMaxStreams(3).build();
                soundPoolBuild3.getClass();
                return soundPoolBuild3;
            default:
                return new lup(((luj) this.a.a()).a(luf.Y));
        }
    }
}
