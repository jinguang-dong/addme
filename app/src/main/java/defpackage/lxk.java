package defpackage;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxk implements tzt {
    private final /* synthetic */ int a;

    public lxk(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new pit((byte[]) null);
            case 1:
                return new szh();
            case 2:
                return new oer();
            case 3:
                ExecutorService executorServiceBZ = ojl.bZ("smz-analysis");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 4:
                ExecutorService executorServiceBZ2 = ojl.bZ(nWEkBGOQPWQp.EKDLBQzs);
                executorServiceBZ2.getClass();
                return executorServiceBZ2;
            case 5:
                return new lpa();
            case 6:
                return a.O();
            case 7:
                SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(4).setFlags(1).build()).setMaxStreams(3).build();
                soundPoolBuild.getClass();
                return soundPoolBuild;
            case 8:
                return new qev(20);
            default:
                return new qpt(bArr);
        }
    }
}
