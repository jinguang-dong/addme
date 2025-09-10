package defpackage;

import android.content.Context;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjo {
    public static final sbv a;
    public static final sbv b;
    public final Context c;
    public final pbn d;
    public final boolean e;
    public final hbj f;

    public fjo(Context context, pbn pbnVar, hbj hbjVar) {
        this.c = context;
        this.d = pbnVar;
        this.e = hbjVar.o(gyi.m);
        this.f = hbjVar;
    }

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(tgc.FACE_DETECTOR_ANCHORS_ID, "hssd_anchors_v5.pb.uncompressed");
        sbrVar.f(tgc.PERSON_DETECTOR_MODEL_300_ID, "pssd_large_8bit_v2.300x300.tflite.uncompressed");
        sbrVar.f(tgc.PERSON_DETECTOR_ANCHOR_2_ID, "pssd_anchors_v2.pb.uncompressed");
        sbrVar.f(tgc.LOOKNET_CONFIG_ID, "face_attributes_client_options.pb.uncompressed");
        sbrVar.f(tgc.LOOKNET_MODEL_ID, "looknet_v2.1_float.tflite.uncompressed");
        sbrVar.f(tgc.MOVENET_MODEL_ID, "movenet_256.tflite.uncompressed");
        sbrVar.f(tgc.MOVENET_LABEL_MAP_ID, "movenet_label_map.binarypb.uncompressed");
        sbrVar.f(tgc.ALL_IN_FILM_BLENDER_ID, "all_in_film_blender.tflite.uncompressed");
        sbrVar.f(tgc.MONOCULAR_DEPTH_ID, "midasnet_mobilenetv2_dptmqn_dec256_sep_082421_384_384_fp16_opt.tflite.uncompressed");
        sbrVar.f(tgc.PEOPLE_DEPTH_ORDERING_ID, "people_depth_ordering.tflite.uncompressed");
        sbrVar.f(tgc.PWC_RAFT_OPTICAL_FLOW_ID, "fusion_pwc_raft_super_1m_c1_s10_d2_8k_42130179_384x512_16f.uncompressed");
        sbv sbvVarB = sbrVar.b();
        a = sbvVarB;
        sbr sbrVar2 = new sbr();
        sbrVar2.j(sbvVarB);
        sbrVar2.f(tgc.FACE_DETECTOR_ID, "hssd_large_8bit_4orient_v5.tflite.uncompressed");
        sbrVar2.f(tgc.PORTRAIT_MATTING_ID, "portrait_matting_mask_1024_768.tflite.uncompressed");
        sbrVar2.f(tgc.FG_COLOR_ESTIMATOR_ID, "foreground_color_estimator_v5680_512_512.tflite.uncompressed");
        sbrVar2.f(tgc.FOREGROUND_SEGMENTER_ID, "raid_foreground_mosaic_512_qat.tflite.uncompressed");
        sbrVar2.f(tgc.FACE_TO_PERSON_SEGMENTER_ID, "raid_person_segmenter_from_face_detection_with_occlusions.tflite.uncompressed");
        sbrVar2.f(tgc.RAID_MATTING_768_ID, "matting_v2_768.f16.tflite.uncompressed");
        sbrVar2.f(tgc.SHADOW_SEGMENTER_ID, "shadow_segmenter_finetuned_ptq_Dec2024.tflite.uncompressed");
        sbrVar2.f(tgc.ATTACHED_OBJECTS_SEGMENTER_ID, "raid_instance_segmenter_with_objects_no_people.tflite.uncompressed");
        sbrVar2.f(tgc.HOI_CLASSIFIER_ID, "hoi_classifier_256x256_rgb_and_boxes.tflite.uncompressed");
        sbrVar2.f(tgc.ATTACHED_OBJECTS_DETECTOR_ID, UvOvSgfD.tpn);
        b = sbrVar2.b();
    }
}
