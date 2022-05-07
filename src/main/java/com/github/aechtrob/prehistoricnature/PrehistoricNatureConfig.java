package com.github.aechtrob.prehistoricnature;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import net.minecraftforge.fml.event.config.ModConfigEvent;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@EventBusSubscriber(modid = PrehistoricNature.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class PrehistoricNatureConfig {
	public static final ClientConfig COMMON;
	public static final ForgeConfigSpec COMMON_SPEC;
	static {
		final Pair<ClientConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}

	public static boolean doPropagation;


	public static List<String> biomeBlacklistCooksonia;
	public static List<String> biomeCooksonia;
	public static boolean biomeoptionCooksonia;
	public static List<String> dimCooksonia;
	public static boolean  genCooksonia;

	public static List<String> biomeBlacklistTreefern;
	public static List<String> biomeTreefern;
	public static boolean  biomeoptionTreefern;
	public static List<String> dimTreefern;
	public static boolean  genTreefern;

	public static List<String> biomeBlacklistHorsetail;
	public static List<String> biomeHorsetail;
	public static boolean  biomeoptionHorsetail;
	public static List<String> dimHorsetail;
	public static boolean  genHorsetail;

	public static List<String> biomeBlacklistPrototaxites;
	public static List<String> biomePrototaxites;
	public static boolean  biomeoptionPrototaxites;
	public static List<String> dimPrototaxites;
	public static boolean  genPrototaxites;

	public static List<String> biomeBlacklistPsilophyton;
	public static List<String> biomePsilophyton;
	public static boolean  biomeoptionPsilophyton;
	public static List<String> dimPsilophyton;
	public static boolean  genPsilophyton;

	public static List<String> biomeBlacklistScalyLepidodendron;
	public static List<String> biomeScalyLepidodendron;
	public static boolean  biomeoptionScalyLepidodendron;
	public static List<String> dimScalyLepidodendron;
	public static boolean  genScalyLepidodendron;

	public static List<String> biomeBlacklistWoodyLepidodendron;
	public static List<String> biomeWoodyLepidodendron;
	public static boolean  biomeoptionWoodyLepidodendron;
	public static List<String> dimWoodyLepidodendron;
	public static boolean  genWoodyLepidodendron;

	public static List<String> biomeBlacklistWattieza;
	public static List<String> biomeWattieza;
	public static boolean  biomeoptionWattieza;
	public static List<String> dimWattieza;
	public static boolean  genWattieza;

	public static List<String> biomeBlacklistWilliamsonia;
	public static List<String> biomeWilliamsonia;
	public static boolean  biomeoptionWilliamsonia;
	public static List<String> dimWilliamsonia;
	public static boolean  genWilliamsonia;
	
	public static List<String> biomeBlacklistEncBlue;
	public static List<String> biomeEncBlue;
	public static boolean  biomeoptionEncBlue;
	public static List<String> dimEncBlue;
	public static boolean  genEncBlue;
	
	public static List<String> biomeBlacklistHorridus;
	public static List<String> biomeHorridus;
	public static boolean  biomeoptionHorridus;
	public static List<String> dimHorridus;
	public static boolean  genHorridus;
	
	public static List<String> biomeBlacklistCycas;
	public static List<String> biomeCycas;
	public static boolean  biomeoptionCycas;
	public static List<String> dimCycas;
	public static boolean  genCycas;
	
	public static List<String> biomeBlacklistDioon;
	public static List<String> biomeDioon;
	public static boolean  biomeoptionDioon;
	public static List<String> dimDioon;
	public static boolean  genDioon;
	
	public static List<String> biomeBlacklistBroadleavedBjuvia;
	public static List<String> biomeBroadleavedBjuvia;
	public static boolean  biomeoptionBroadleavedBjuvia;
	public static List<String> dimBroadleavedBjuvia;
	public static boolean  genBroadleavedBjuvia;
	
	public static List<String> biomeBlacklistSlenderBjuvia;
	public static List<String> biomeSlenderBjuvia;
	public static boolean  biomeoptionSlenderBjuvia;
	public static List<String> dimSlenderBjuvia;
	public static boolean  genSlenderBjuvia;
	

	@SubscribeEvent
	public static void onModConfigEvent(final ModConfigEvent configEvent) {
		bakeConfig();
	}

	public static void bakeConfig() {

		doPropagation = COMMON.doPropagation.get();

		
		biomeBlacklistCooksonia = COMMON.biomeBlacklistCooksonia.get();
		biomeCooksonia = COMMON.biomeCooksonia.get();
		biomeoptionCooksonia = COMMON.biomeoptionCooksonia.get();
		dimCooksonia = COMMON.dimCooksonia.get();
		genCooksonia = COMMON.genCooksonia.get();

		biomeBlacklistTreefern = COMMON.biomeBlacklistTreefern.get();
		biomeTreefern = COMMON.biomeTreefern.get();
		biomeoptionTreefern = COMMON.biomeoptionTreefern.get();
		dimTreefern = COMMON.dimTreefern.get();
		genTreefern = COMMON.genTreefern.get();

		biomeBlacklistHorsetail = COMMON.biomeBlacklistHorsetail.get();
		biomeHorsetail = COMMON.biomeHorsetail.get();
		biomeoptionHorsetail = COMMON.biomeoptionHorsetail.get();
		dimHorsetail = COMMON.dimHorsetail.get();
		genHorsetail = COMMON.genHorsetail.get();

		biomeBlacklistPrototaxites = COMMON.biomeBlacklistPrototaxites.get();
		biomePrototaxites = COMMON.biomePrototaxites.get();
		biomeoptionPrototaxites = COMMON.biomeoptionPrototaxites.get();
		dimPrototaxites = COMMON.dimPrototaxites.get();
		genPrototaxites = COMMON.genPrototaxites.get();

		biomeBlacklistPsilophyton = COMMON.biomeBlacklistPsilophyton.get();
		biomePsilophyton = COMMON.biomePsilophyton.get();
		biomeoptionPsilophyton = COMMON.biomeoptionPsilophyton.get();
		dimPsilophyton = COMMON.dimPsilophyton.get();
		genPsilophyton = COMMON.genPsilophyton.get();

		biomeBlacklistScalyLepidodendron = COMMON.biomeBlacklistScalyLepidodendron.get();
		biomeScalyLepidodendron = COMMON.biomeScalyLepidodendron.get();
		biomeoptionScalyLepidodendron = COMMON.biomeoptionScalyLepidodendron.get();
		dimScalyLepidodendron = COMMON.dimScalyLepidodendron.get();
		genScalyLepidodendron = COMMON.genScalyLepidodendron.get();

		biomeBlacklistWoodyLepidodendron = COMMON.biomeBlacklistWoodyLepidodendron.get();
		biomeWoodyLepidodendron = COMMON.biomeWoodyLepidodendron.get();
		biomeoptionWoodyLepidodendron = COMMON.biomeoptionWoodyLepidodendron.get();
		dimWoodyLepidodendron = COMMON.dimWoodyLepidodendron.get();
		genWoodyLepidodendron = COMMON.genWoodyLepidodendron.get();

		biomeBlacklistWattieza = COMMON.biomeBlacklistWattieza.get();
		biomeWattieza = COMMON.biomeWattieza.get();
		biomeoptionWattieza = COMMON.biomeoptionWattieza.get();
		dimWattieza = COMMON.dimWattieza.get();
		genWattieza = COMMON.genWattieza.get();

		biomeBlacklistWilliamsonia = COMMON.biomeBlacklistWilliamsonia.get();
		biomeWilliamsonia = COMMON.biomeWilliamsonia.get();
		biomeoptionWilliamsonia = COMMON.biomeoptionWilliamsonia.get();
		dimWilliamsonia = COMMON.dimWilliamsonia.get();
		genWilliamsonia = COMMON.genWilliamsonia.get();

		biomeBlacklistEncBlue = COMMON.biomeBlacklistEncBlue.get();
		biomeEncBlue = COMMON.biomeEncBlue.get();
		biomeoptionEncBlue = COMMON.biomeoptionEncBlue.get();
		dimEncBlue = COMMON.dimEncBlue.get();
		genEncBlue = COMMON.genEncBlue.get();

		biomeBlacklistHorridus = COMMON.biomeBlacklistHorridus.get();
		biomeHorridus = COMMON.biomeHorridus.get();
		biomeoptionHorridus = COMMON.biomeoptionHorridus.get();
		dimHorridus = COMMON.dimHorridus.get();
		genHorridus = COMMON.genHorridus.get();

		biomeBlacklistCycas = COMMON.biomeBlacklistCycas.get();
		biomeCycas = COMMON.biomeCycas.get();
		biomeoptionCycas = COMMON.biomeoptionCycas.get();
		dimCycas = COMMON.dimCycas.get();
		genCycas = COMMON.genCycas.get();

		biomeBlacklistDioon = COMMON.biomeBlacklistDioon.get();
		biomeDioon = COMMON.biomeDioon.get();
		biomeoptionDioon = COMMON.biomeoptionDioon.get();
		dimDioon = COMMON.dimDioon.get();
		genDioon = COMMON.genDioon.get();

		biomeBlacklistBroadleavedBjuvia = COMMON.biomeBlacklistBroadleavedBjuvia.get();
		biomeBroadleavedBjuvia = COMMON.biomeBroadleavedBjuvia.get();
		biomeoptionBroadleavedBjuvia = COMMON.biomeoptionBroadleavedBjuvia.get();
		dimBroadleavedBjuvia = COMMON.dimBroadleavedBjuvia.get();
		genBroadleavedBjuvia = COMMON.genBroadleavedBjuvia.get();

		biomeBlacklistSlenderBjuvia = COMMON.biomeBlacklistSlenderBjuvia.get();
		biomeSlenderBjuvia = COMMON.biomeSlenderBjuvia.get();
		biomeoptionSlenderBjuvia = COMMON.biomeoptionSlenderBjuvia.get();
		dimSlenderBjuvia = COMMON.dimSlenderBjuvia.get();
		genSlenderBjuvia = COMMON.genSlenderBjuvia.get();
	}

	public static class ClientConfig {

		public final ForgeConfigSpec.ConfigValue<Boolean> doPropagation;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCooksonia;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeCooksonia;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionCooksonia;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimCooksonia;
		public final ForgeConfigSpec.ConfigValue<Boolean> genCooksonia;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistTreefern;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeTreefern;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionTreefern;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimTreefern;
		public final ForgeConfigSpec.ConfigValue<Boolean> genTreefern;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistHorsetail;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeHorsetail;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionHorsetail;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimHorsetail;
		public final ForgeConfigSpec.ConfigValue<Boolean> genHorsetail;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistPrototaxites;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomePrototaxites;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionPrototaxites;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimPrototaxites;
		public final ForgeConfigSpec.ConfigValue<Boolean> genPrototaxites;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistPsilophyton;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomePsilophyton;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionPsilophyton;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimPsilophyton;
		public final ForgeConfigSpec.ConfigValue<Boolean> genPsilophyton;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistScalyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeScalyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionScalyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimScalyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<Boolean> genScalyLepidodendron;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistWoodyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeWoodyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionWoodyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimWoodyLepidodendron;
		public final ForgeConfigSpec.ConfigValue<Boolean> genWoodyLepidodendron;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistWattieza;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeWattieza;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionWattieza;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimWattieza;
		public final ForgeConfigSpec.ConfigValue<Boolean> genWattieza;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistWilliamsonia;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeWilliamsonia;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionWilliamsonia;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimWilliamsonia;
		public final ForgeConfigSpec.ConfigValue<Boolean> genWilliamsonia;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEncBlue;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeEncBlue;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionEncBlue;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimEncBlue;
		public final ForgeConfigSpec.ConfigValue<Boolean> genEncBlue;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistHorridus;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeHorridus;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionHorridus;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimHorridus;
		public final ForgeConfigSpec.ConfigValue<Boolean> genHorridus;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCycas;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeCycas;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionCycas;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimCycas;
		public final ForgeConfigSpec.ConfigValue<Boolean> genCycas;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistDioon;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeDioon;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionDioon;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimDioon;
		public final ForgeConfigSpec.ConfigValue<Boolean> genDioon;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistBroadleavedBjuvia;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBroadleavedBjuvia;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionBroadleavedBjuvia;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimBroadleavedBjuvia;
		public final ForgeConfigSpec.ConfigValue<Boolean> genBroadleavedBjuvia;

		public final ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistSlenderBjuvia;
		public final ForgeConfigSpec.ConfigValue<List<String>> biomeSlenderBjuvia;
		public final ForgeConfigSpec.ConfigValue<Boolean> biomeoptionSlenderBjuvia;
		public final ForgeConfigSpec.ConfigValue<List<String>> dimSlenderBjuvia;
		public final ForgeConfigSpec.ConfigValue<Boolean> genSlenderBjuvia;

		public ClientConfig(ForgeConfigSpec.Builder builder) {
			builder.push("1. General");
			doPropagation = builder
				.comment("Use the modded propagation methods instead of vanilla-style plant/sapling-drops for appropriate plants [default: true]")
				.translation("doPropagation")
				.define("doPropagation", true);
			builder.pop();

			builder.push("Cooksonia");
			biomeBlacklistCooksonia = builder
					.comment("List of biomes Cooksonia are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistCooksonia")
					.define("biomeBlacklistCooksonia", new ArrayList<>());	
			biomeCooksonia = builder
					.comment("List of biomes Cooksonia can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeCooksonia")
					.define("biomeCooksonia", new ArrayList<>());	
			biomeoptionCooksonia = builder
					.comment("Set to true to generate Cooksonia in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are SWAMP and LUSH but never SNOWY) [default: false]")
					.translation("biomeoptionCooksonia")
					.define("biomeoptionCooksonia", false);
			dimCooksonia = builder
					.comment("List of dimension IDs Cooksonia can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimCooksonia")
					.define("dimCooksonia", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genCooksonia = builder
					.comment("Set to true/false to toggle generation of Cooksonia naturally [default: true]")
					.translation("genCooksonia")
					.define("genCooksonia", true);
			builder.pop();
			
			builder.push("Tree Fern");
			biomeBlacklistTreefern = builder
					.comment("List of biomes Tree Ferns are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistTreefern")
					.define("biomeBlacklistTreefern", new ArrayList<>());
			biomeTreefern = builder
					.comment("List of biomes Tree Ferns can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeTreefern")
					.define("biomeTreefern", new ArrayList<>());	
			biomeoptionTreefern = builder
					.comment("Set to true to generate Tree Ferns in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (SWAMP, FOREST and CONIFEROUS but never SNOWY) [default: false]")
					.translation("biomeoptionTreefern")
					.define("biomeoptionTreefern", false);
			dimTreefern = builder
					.comment("List of dimension IDs Tree Ferns can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimTreefern")
					.define("dimTreefern", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genTreefern = builder
					.comment("Set to true/false to toggle generation of Tree Ferns naturally [default: true]")
					.translation("genTreefern")
					.define("genTreefern", true);
			builder.pop();
			
			builder.push("Giant Horsetail");
			biomeBlacklistHorsetail = builder
					.comment("List of biomes Giant Horsetails are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistHorsetail")
					.define("biomeBlacklistHorsetail", new ArrayList<>());
			biomeHorsetail = builder
					.comment("List of biomes Giant Horsetails can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeHorsetail")
					.define("biomeHorsetail", new ArrayList<>());	
			biomeoptionHorsetail = builder
					.comment("Set to true to generate Giant Horsetails in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are SWAMP, RIVER and JUNGLE) [default: false]")
					.translation("biomeoptionHorsetail")
					.define("biomeoptionHorsetail", false);
			dimHorsetail = builder
					.comment("List of dimension IDs Giant Horsetails can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimHorsetail")
					.define("dimHorsetail", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genHorsetail = builder
					.comment("Set to true/false to toggle generation of Giant Horsetails naturally [default: true]")
					.translation("genHorsetail")
					.define("genHorsetail", true);
			builder.pop();
			
			builder.push("Prototaxites");
			biomeBlacklistPrototaxites = builder
					.comment("List of biomes Prototaxites are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistPrototaxites")
					.define("biomeBlacklistPrototaxites", new ArrayList<>());
			biomePrototaxites = builder
					.comment("List of biomes Prototaxites can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomePrototaxites")
					.define("biomePrototaxites", new ArrayList<>());	
			biomeoptionPrototaxites = builder
					.comment("Set to  true to generate Prototaxites in the list of biomes set in this config or false to allow spawning in any biome [default: false]")
					.translation("biomeoptionPrototaxites")
					.define("biomeoptionPrototaxites", false);
			dimPrototaxites = builder
					.comment("List of dimension IDs Prototaxites can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimPrototaxites")
					.define("dimPrototaxites", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genPrototaxites = builder
					.comment("Set to true/false to toggle generation of Prototaxites naturally [default: true]")
					.translation("genPrototaxites")
					.define("genPrototaxites", true);
			builder.pop();
			
			builder.push("Psilophyton");
			biomeBlacklistPsilophyton = builder
					.comment("List of biomes Psilophyton are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistPsilophyton")
					.define("biomeBlacklistPsilophyton", new ArrayList<>());
			biomePsilophyton = builder
					.comment("List of biomes Psilophyton can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomePsilophyton")
					.define("biomePsilophyton", new ArrayList<>());	
			biomeoptionPsilophyton = builder
					.comment("Set to true to generate Psilophyton in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are RIVER, WET, LUSH, PLAINS but never SNOWY) [default: false]")
					.translation("biomeoptionPsilophyton")
					.define("biomeoptionPsilophyton", false);
			dimPsilophyton = builder
					.comment("List of dimension IDs Psilophyton can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimPsilophyton")
					.define("dimPsilophyton", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genPsilophyton = builder
					.comment("Set to true/false to toggle generation of Psilphyton naturally [default: true]")
					.translation("genPsilophyton")
					.define("genPsilophyton", true);
			builder.pop();
			
			builder.push("Scaly Lepidodendron");
			biomeBlacklistScalyLepidodendron = builder
					.comment("List of biomes Scaly Lepidodendrons are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistScalyLepidodendron")
					.define("biomeBlacklistScalyLepidodendron", new ArrayList<>());
			biomeScalyLepidodendron = builder
					.comment("List of biomes Scaly Lepidodendrons can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeScalyLepidodendron")
					.define("biomeScalyLepidodendron", new ArrayList<>());	
			biomeoptionScalyLepidodendron = builder
					.comment("Set to true to generate Scaly Lepidodendrons in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are SWAMP and RIVER but never SNOWY) [default: false]")
					.translation("biomeoptionScalyLepidodendron")
					.define("biomeoptionScalyLepidodendron", false);
			dimScalyLepidodendron = builder
					.comment("List of dimension IDs Scaly Lepidodendrons can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimScalyLepidodendron")
					.define("dimScalyLepidodendron", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genScalyLepidodendron = builder
					.comment("Set to true/false to toggle generation of Scaly Lepidodendrons naturally [default: true]")
					.translation("genScalyLepidodendron")
					.define("genScalyLepidodendron", true);
			builder.pop();
			
			builder.push("Woody Lepidodendron");
			biomeBlacklistWoodyLepidodendron = builder
					.comment("List of biomes Woody Lepidodendrons are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistWoodyLepidodendron")
					.define("biomeBlacklistWoodyLepidodendron", new ArrayList<>());
			biomeWoodyLepidodendron = builder
					.comment("List of biomes Woody Lepidodendrons can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeWoodyLepidodendron")
					.define("biomeWoodyLepidodendron", new ArrayList<>());	
			biomeoptionWoodyLepidodendron = builder
					.comment("Set to true to generate Woody Lepidodendrons in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are SWAMP, RIVER and CONIFEROUS but never SNOWY) [default: false]")
					.translation("biomeoptionWoodyLepidodendron")
					.define("biomeoptionWoodyLepidodendron", false);
			dimWoodyLepidodendron = builder
					.comment("List of dimension IDs Woody Lepidodendrons can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimWoodyLepidodendron")
					.define("dimWoodyLepidodendron", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genWoodyLepidodendron = builder
					.comment("Set to true/false to toggle generation of Woody Lepidodendrons naturally [default: true]")
					.translation("genWoodyLepidodendron")
					.define("genWoodyLepidodendron", true);
			builder.pop();
			
			builder.push("Wattieza");
			biomeBlacklistWattieza = builder
					.comment("List of biomes Wattieza are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistWattieza")
					.define("biomeBlacklistWattieza", new ArrayList<>());
			biomeWattieza = builder
					.comment("List of biomes Wattieza can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeWattieza")
					.define("biomeWattieza", new ArrayList<>());	
			biomeoptionWattieza = builder
					.comment("Set to true to generate Wattieza in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are JUNGLE, SWAMP, FOREST and WET but never SNOWY) [default: false]")
					.translation("biomeoptionWattieza")
					.define("biomeoptionWattieza", false);
			dimWattieza = builder
					.comment("List of dimension IDs Wattieza can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimWattieza")
					.define("dimWattieza", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genWattieza = builder
					.comment("Set to true/false to toggle generation of Wattieza naturally [default: true]")
					.translation("genWattieza")
					.define("genWattieza", true);
			builder.pop();
			
			builder.push("Williamsonia");
			biomeBlacklistWilliamsonia = builder
					.comment("List of biomes Williamsonia are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistWilliamsonia")
					.define("biomeBlacklistWilliamsonia", new ArrayList<>());
			biomeWilliamsonia = builder
					.comment("List of biomes Williamsonia can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeWilliamsonia")
					.define("biomeWilliamsonia", new ArrayList<>());	
			biomeoptionWilliamsonia = builder
					.comment("Set to true to generate Williamsonia in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are PLAINS, BEACH and SAVANNA but never SNOWY) [default: false]")
					.translation("biomeoptionWilliamsonia")
					.define("biomeoptionWilliamsonia", false);
			dimWilliamsonia = builder
					.comment("List of dimension IDs Williamsonia can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimWilliamsonia")
					.define("dimWilliamsonia", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genWilliamsonia = builder
					.comment("Set to true/false to toggle generation of Williamsonia naturally [default: true]")
					.translation("genWilliamsonia")
					.define("genWilliamsonia", true);
			builder.pop();
			
			builder.push("Blue Encephalartos");
			biomeBlacklistEncBlue = builder
					.comment("List of biomes Blue Encephalartos are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistEncBlue")
					.define("biomeBlacklistEncBlue", new ArrayList<>());
			biomeEncBlue = builder
					.comment("List of biomes Blue Encephalartos can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeEncBlue")
					.define("biomeEncBlue", new ArrayList<>());	
			biomeoptionEncBlue = builder
					.comment("Set to true to generate Blue Encephalartos in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are HILLS and SAVANNA but never SNOWY or COLD) [default: false]")
					.translation("biomeoptionEncBlue")
					.define("biomeoptionEncBlue", false);
			dimEncBlue = builder
					.comment("List of dimension IDs Blue Encephalartos can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimEncBlue")
					.define("dimEncBlue", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genEncBlue = builder
					.comment("Set to true/false to toggle generation of Blue Encephalartos naturally [default: true]")
					.translation("genEncBlue")
					.define("genEncBlue", true);
			builder.pop();
			
			builder.push("Encephalartos Horridus");
			biomeBlacklistHorridus = builder
					.comment("List of biomes Encephalartos Horridus are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistHorridus")
					.define("biomeBlacklistHorridus", new ArrayList<>());
			biomeHorridus = builder
					.comment("List of biomes Encephalartos Horridus can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeHorridus")
					.define("biomeHorridus", new ArrayList<>());	
			biomeoptionHorridus = builder
					.comment("Set to true to generate Encephalartos Horridus in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are SANDY and SAVANNA but never SNOWY or COLD) [default: false]")
					.translation("biomeoptionHorridus")
					.define("biomeoptionHorridus", false);
			dimHorridus = builder
					.comment("List of dimension IDs Encephalartos Horridus can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimHorridus")
					.define("dimHorridus", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genHorridus = builder
					.comment("Set to true/false to toggle generation of Encephalartos Horridus naturally [default: true]")
					.translation("genHorridus")
					.define("genHorridus", true);
			builder.pop();
			
			builder.push("Cycas");
			biomeBlacklistCycas = builder
					.comment("List of biomes Cycas are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistCycas")
					.define("biomeBlacklistCycas", new ArrayList<>());
			biomeCycas = builder
					.comment("List of biomes Cycas can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeCycas")
					.define("biomeCycas", new ArrayList<>());	
			biomeoptionCycas = builder
					.comment("Set to true to generate Cycas in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which is FOREST) [default: false]")
					.translation("biomeoptionCycas")
					.define("biomeoptionCycas", false);
			dimCycas = builder
					.comment("List of dimension IDs Cycas can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimCycas")
					.define("dimCycas", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genCycas = builder
					.comment("Set to true/false to toggle generation of Cycas naturally [default: true]")
					.translation("genCycas")
					.define("genCycas", true);
			builder.pop();
			
			builder.push("Dioon");
			biomeBlacklistDioon = builder
					.comment("List of biomes Dioon are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistDioon")
					.define("biomeBlacklistDioon", new ArrayList<>());
			biomeDioon = builder
					.comment("List of biomes Dioon can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeDioon")
					.define("biomeDioon", new ArrayList<>());	
			biomeoptionDioon = builder
					.comment("Set to true to generate Dioon in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are FOREST and PLAINS) [default: false]")
					.translation("biomeoptionDioon")
					.define("biomeoptionDioon", false);
			dimDioon = builder
					.comment("List of dimension IDs Dioon can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimDioon")
					.define("dimDioon", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genDioon = builder
					.comment("Set to true/false to toggle generation of Dioon naturally [default: true]")
					.translation("genDioon")
					.define("genDioon", true);
			builder.pop();
			
			builder.push("Broad-Leaved Bjuvia");
			biomeBlacklistBroadleavedBjuvia = builder
					.comment("List of biomes Broad-Leaved Bjuvia are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistBroadleavedBjuvia")
					.define("biomeBlacklistBroadleavedBjuvia", new ArrayList<>());
			biomeBroadleavedBjuvia = builder
					.comment("List of biomes Broad-Leaved Bjuvia can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeBroadleavedBjuvia")
					.define("biomeBroadleavedBjuvia", new ArrayList<>());	
			biomeoptionBroadleavedBjuvia = builder
					.comment("Set to true to generate Broad-Leaved Bjuvia in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are WET, RIVER, SWAMP and LUSH but never DRY) [default: false]")
					.translation("biomeoptionBroadleavedBjuvia")
					.define("biomeoptionBroadleavedBjuvia", false);
			dimBroadleavedBjuvia = builder
					.comment("List of dimension IDs Broad-Leaved Bjuvia can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimBroadleavedBjuvia")
					.define("dimBroadleavedBjuvia", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genBroadleavedBjuvia = builder
					.comment("Set to true/false to toggle generation of Broad-Leaved Bjuvia naturally [default: true]")
					.translation("genBroadleavedBjuvia")
					.define("genBroadleavedBjuvia", true);
			builder.pop();
			
			builder.push("Slender Bjuvia");
			biomeBlacklistSlenderBjuvia = builder
					.comment("List of biomes Slender Bjuvia are blacklisted from, seperated by commas, in the format \"modid:biomeid\" [default: empty]")
					.translation("biomeBlacklistSlenderBjuvia")
					.define("biomeBlacklistSlenderBjuvia", new ArrayList<>());
			biomeSlenderBjuvia = builder
					.comment("List of biomes Slender Bjuvia can generate in, seperated by commas, in the format \"modid:biome\" [default: empty]")
					.translation("biomeSlenderBjuvia")
					.define("biomeSlenderBjuvia", new ArrayList<>());	
			biomeoptionSlenderBjuvia = builder
					.comment("Set to true to generate Slender Bjuvia in the list of biomes set in this config or set to false to use the default BiomeDictionary Types (which are WET, RIVER, SWAMP and LUSH but never DRY) [default: false]")
					.translation("biomeoptionSlenderBjuvia")
					.define("biomeoptionSlenderBjuvia", false);
			dimSlenderBjuvia = builder
					.comment("List of dimension IDs Slender Bjuvia can generate in, seperated by commas, in the format \"modid:dimension\" [default: \"minecraft:overworld\"]")
					.translation("dimSlenderBjuvia")
					.define("dimSlenderBjuvia", new ArrayList<String>(Arrays.asList("minecraft:overworld")));
			genSlenderBjuvia = builder
					.comment("Set to true/false to toggle generation of Slender Bjuvia naturally [default: true]")
					.translation("genSlenderBjuvia")
					.define("genSlenderBjuvia", true);
			builder.pop();
			
		}

	}

	    public static boolean shouldGenerateInBiome(Biome biome, List<String> biomesList) {
    	
        List<String> var2 = biomesList;

        for(int i =0; i < var2.size(); i++) {
            String checkBiome = var2.get(i);
            if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
                return true;
            }
        }

        return false;
    }
    

    public static boolean shouldGenerateInDimension(String dimName, List<String> dimList) {

        List<String> var2 = dimList;
        int var3 = var2.size();
		if (var3 == 1) {
			String dim = var2.get(0);
	            if (dim.equalsIgnoreCase(dimName)) {
	                return true;
	            }
		}
		else {
	        for(int i =0; i < var2.size(); i++) {
	            String dim = var2.get(i);
	            if (dim.equalsIgnoreCase(dimName)) {
	                return true;
	            }
	        }
		}
        return false;
    }

}